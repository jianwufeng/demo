package com.example.demo.util.date;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("all")
public class ConstantUtils {

    protected static Logger    logger            = LoggerFactory.getLogger(ConstantUtils.class);

    public static final String DATE_TIME_FORMAT  = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_TIMEZONE     = "GMT+8";

    public static final String CHARSET_UTF8      = "UTF-8";

    public static final String CHARSET_GBK       = "GBK";

    public static final String FORMAT_JSON       = "json";

    public static final String FORMAT_XML        = "xml";

    public static final Long   DEFAULT_BDO       = 388L;

    // 分隔�?
    public static final String SEGMENTATION      = ",";

    public static final String CONFIG_FILE       = "/properties/system-config.properties";

    public static String       TOKEN_COOKIE_ID   = "";

    public static String       ROBO_SERVICE_IP   = "";

    public static String       CRM_METEDATA_PATH = "";                                          // 产生元数据的路径

    private static Map         CONFIG;

    static {
        reload();
    }

    private ConstantUtils() {
    }

    public static void reload() {
        Map<String, String> config = load(CONFIG_FILE, ConstantUtils.class);
        if (config == null || config.isEmpty()) {
            logger.info("Loadding config file {}, which is EMPTY!", CONFIG_FILE);
            return;
        }
        String spilt = "SYS_";
        for (String key : config.keySet()) {
            if (key.startsWith(spilt)) {
                String name = key.substring(key.indexOf(spilt) + spilt.length());
                System.getProperties().put(name, config.get(key));
                logger.info(">>>>>>>>>>>>>>>>>>>" + name + " : " + config.get(key));
            }
        }

        logger.info("Loadding config file {}, which is {}", CONFIG_FILE, config);

        Field[] fields = ConstantUtils.class.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> clazz = field.getType();
            if (clazz.isPrimitive()) {
                logger.info("Ignore field as it's primitive   : {} {}", clazz.getSimpleName(), name);
                continue;
            }
            if (field.toString().contains("final")) {
                logger.info("Ignore field as it's final       : {} {}", clazz.getSimpleName(), name);
                continue;
            }
            if (!config.containsKey(name)) {
                logger.info("Ignore field as no config for it : {} {}", clazz.getSimpleName(), name);
                continue;
            }

            String str = config.get(name);
            try {
                Object value = str;
                if (clazz.equals(Integer.class)) {
                    value = NumberUtils.toInt(str, 0);
                } else if (clazz.equals(Long.class)) {
                    value = NumberUtils.toLong(str, 0);
                } else if (clazz.equals(Double.class)) {
                    value = NumberUtils.toDouble(str, 0);
                } else if (clazz.equals(Date.class)) {
                    value = DateUtils.parseDate(str, new String[] { "yyyy-MM-dd HH-mm-ss" });
                }
                logger.info("Setting field {} = {}", name, value);
                field.set(null, value);
            } catch (Exception e) {
                logger.info("Error when setting value '" + str + "' for field " + name, e);
            }
        }

        print();
    }

    private static void print() {
        Map config = new HashMap();
        Field[] fields = ConstantUtils.class.getDeclaredFields();
        for (Field field : fields) {
            String name = field.getName();
            Class<?> clazz = field.getType();

            try {
                Object value = field.get(null);
                config.put(name, value);
                logger.info("{} = {}", StringUtils.rightPad(name, 30), value);
            } catch (Exception e) {
                logger.info("Error when accessing value for field {}", name);
            }
        }

        CONFIG = Collections.unmodifiableMap(config);
    }

    public static Map load(String path, Class clazz) {
        if (StringUtils.isEmpty(path))
            return null;

        logger.info("Loading properties : {}", path);

        InputStream in = null;
        Properties p = null;
        try {
            if (clazz != null) {
                in = clazz.getResourceAsStream(path);
            } else {
                in = new FileInputStream(path);
            }
            p = new Properties();
            p.load(in);

            logger.info("Loading properties : {}", p);
        } catch (Exception e) {
            logger.error("Error on loading config file : " + path, e);
        } finally {
            IOUtils.closeQuietly(in);
        }
        return p;
    }
}
