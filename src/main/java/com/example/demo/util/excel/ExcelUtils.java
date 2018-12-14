package com.example.demo.util.excel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelUtils {

    public static final String NULL_STR = "NULL";
    public static final String BLANK_STR = "";

    public static void main(String[] args) {

    }

    public static <T> void transferToArrAndSetValue(HSSFWorkbook hssf, List<T> list, Class<T> clzz) throws IllegalArgumentException, IllegalAccessException {
        if (list == null || list.size() == 0) {
            return;
        }

        HSSFSheet sheet = hssf.getSheetAt(0);
        Field[] fields = clzz.getDeclaredFields();

        for (Field field : fields) {
            if (!"serialVersionUID".equalsIgnoreCase(field.getName())) {
                // 判断是否 不需要导�?
                ExportExcelPar notpar = field.getAnnotation(ExportExcelPar.class);
                if (notpar == null || (notpar != null && notpar.ifExport())) {
                    // 导出
                    field.setAccessible(true);
                }
            }

        }

        for (int i = 0; i < list.size(); i++) {
            List<String> strings = new ArrayList<String>();
            for (Field field : fields) {
                if (!"serialVersionUID".equalsIgnoreCase(field.getName())) {
                    // 判断是否 不需要导�?
                    ExportExcelPar notpar = field.getAnnotation(ExportExcelPar.class);
                    if (notpar == null || (notpar != null && notpar.ifExport())) {
                        // 导出
                        String str = "";
                        Object o = field.get(list.get(i));
                        if (notpar == null) {
                            str = (o == null ? BLANK_STR : o.toString());
                        } else {
                            if (o != null) {
                                // 前缀/ 后缀
                                if (!BLANK_STR.equals(notpar.prefix())) {
                                    str = notpar.prefix();
                                }
                                str += o.toString();
                                if (!BLANK_STR.equals(notpar.postfix())) {
                                    str = str + notpar.postfix();
                                }
                            } else {
                                str += (notpar.ifShowNull() ? NULL_STR : BLANK_STR);
                            }
                        }
                        strings.add(str);
                    }
                }
            }
            for (int j = 0; j < strings.size(); j++) {
                setValue(sheet, i, j, strings);
            }
        }

    }

    private static void setValue(HSSFSheet sheet, int i, int j, List<String> strings) {
        HSSFCell cellTemp = null;
        if (j == 0) {
            cellTemp = sheet.createRow(i + 1).createCell(j);
            cellTemp.setCellType(HSSFCell.CELL_TYPE_STRING);
            cellTemp.setCellValue(strings.get(j));
        } else {
            cellTemp = sheet.getRow(i + 1).createCell(j);
            cellTemp.setCellType(HSSFCell.CELL_TYPE_STRING);
            cellTemp.setCellValue(strings.get(j));
        }
    }

    /**
     * 导出excel
     * 
     * @author howard
     * @param response
     * @param arr 表头列表
     * @param list 数据数组
     * @param clzz 数据对象类型
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static <T> void export(HttpServletResponse response, String[] arr, List<T> list, Class<T> clzz) throws IllegalArgumentException,
            IllegalAccessException {
        // String arr[] = {"日期","1�?","2-10�?","11-50�?","51-100�?","101�?"};
        HSSFWorkbook hssf = writeExcelFirst(arr, true);
        transferToArrAndSetValue(hssf, list, clzz);
        responseXLS("" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), response, hssf);
    }

    /**
     * 导出excel
     * 
     * @author howard
     * @param response
     * @param xlsName xcel名字前缀
     * @param arr 表头列表
     * @param list 数据数组
     * @param clzz 数据对象类型
     * @throws IllegalArgumentException
     * @throws IllegalAccessException
     */
    public static <T> void export(HttpServletResponse response, String xlsName, String[] arr, List<T> list, Class<T> clzz) throws IllegalArgumentException,
            IllegalAccessException {
        // String arr[] = {"日期","1�?","2-10�?","11-50�?","51-100�?","101�?"};
        HSSFWorkbook hssf = writeExcelFirst(arr, true);
        transferToArrAndSetValue(hssf, list, clzz);
        if (StringUtils.isBlank(xlsName)) {
            xlsName = "";
        }
        responseXLS(xlsName + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()), response, hssf);
    }

    /**
     * true为写�?行标�? false为写�?列标�?
     * 
     * @param arr
     * @param ifRow
     * @return
     */
    private static HSSFWorkbook writeExcelFirst(String[] arr, boolean ifRow) {
        HSSFWorkbook workbook = new HSSFWorkbook(); // 产生工作簿对�?
        HSSFSheet sheet = workbook.createSheet(); // 产生工作表对�?
        workbook.setSheetName(0, "default");
        sheet.setColumnWidth(0, 20 * 256);
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (ifRow) {
                HSSFCell cellTemp = null;
                if (i == 0) {
                    cellTemp = sheet.createRow(0).createCell(i);
                } else {
                    cellTemp = sheet.getRow(0).createCell(i);
                }
                cellTemp.setCellType(HSSFCell.CELL_TYPE_STRING);
                cellTemp.setCellValue(arr[i]);
            } else {
                HSSFCell cellTemp = sheet.createRow(i).createCell(0);
                cellTemp.setCellType(HSSFCell.CELL_TYPE_STRING);
                cellTemp.setCellValue(arr[i]);
            }

        }
        return workbook;
    }

    public static void responseXLS(String xlsName, HttpServletResponse response, HSSFWorkbook workbook) {
        OutputStream os = null;
        try {
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setHeader("content-disposition", "attachment;filename=" + xlsName + ".xls");
            // 写入�? 客户端response
            os = response.getOutputStream();
            workbook.write(os);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.flush();
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
