package com.example.demo.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateUtils {

    public static String defaultFormatDate(Date date) {
        return formatDate(date, ConstantUtils.DATE_TIME_FORMAT);
    }

    public static String formatDate(Date date, String format) {
        return formatDate(date.getTime(), format);
    }

    public static String defaultFormatDate(long date) {
        return formatDate(date, ConstantUtils.DATE_TIME_FORMAT);
    }

    public static String formatDate(long date, String format) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern(format);
        return formatter.print(date);
    }

    public static Date defaultParseDate(String date) throws ParseException {
        return parseDate(date, ConstantUtils.DATE_TIME_FORMAT);
    }

    public static Date parseDate(String date, String format) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormat.forPattern(format);
        return new Date(formatter.parseMillis(date));
    }

    public static Date getCurrentDateWithoutTime() {
        try {
            return parseDate(formatDate(new Date(), "yyyy/MM/dd"), "yyyy/MM/dd");
        } catch (ParseException e) {
            return null;
        }
    }

    public static Date getCurrentDate() {
        return new Date();
    }

    public static Date createDate(Long time) {
        if (time == null) {
            return null;
        }
        return new Date(time);
    }

    public static Date getStartTimeOfWeek(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return getStartTimeOfDay(calendar);
    }

    /**
     * 获取本周的开始时�?
     * 
     * @return
     */
    public static Date getThisWeekStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return getStartTimeOfDay(calendar);
    }

    /**
     * 获取本周的结束时�?
     * 
     * @return
     */
    public static Date getThisWeekEndTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return getEndTimeOfDay(calendar);
    }

    /**
     * 获取当月的开始时�?
     * 
     * @return
     */
    public static Date getThisMonthStartTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return getStartTimeOfDay(calendar);
    }

    /**
     * 获取当月的结束时�?
     * 
     * @return
     */
    public static Date getThisMonthEndTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 0);
        return getEndTimeOfDay(calendar);
    }

    /**
     * 将一个日期增加count�?
     * 
     * @param date
     * @param count
     * @return
     */
    public static Date addDate(Date date, int count) {
        if (date != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, count);
            return cal.getTime();
        }

        return null;
    }

    /**
     * 获取�?天的�?始时�?
     * 
     * @return
     */
    public static Date getStartTimeOfDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取�?天的�?始时�?
     * 
     * @return
     */
    public static Date getStartTimeOfDay(Calendar calendar) {
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取�?天的结束时间
     * 
     * @return
     */
    public static Date getEndTimeOfDay(Calendar calendar) {
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 23, 59, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTime();
    }

    /**
     * 获取�?天的结束时间
     * 
     * @return
     */
    public static Date getEndTimeOfDay(Date date) {
        if (date == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return getEndTimeOfDay(calendar);
    }

    public static Date parseDate(Long startTime) {
        Date startCreateTime = null;
        if (startTime != null) {
            startCreateTime = new Date(startTime);
        }
        return startCreateTime;
    }

    public static Date formatString(String date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String getToDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }

    public static Date offsetDay(Date baseDate, int offsetDay) {

        if (baseDate != null) {
            long offsetMilliseconds = 24 * 60 * 60 * 1000 * offsetDay;
            Date date = new Date(baseDate.getTime() + offsetMilliseconds);
            return date;
        }

        return null;

    }

    public static int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.getWeekYear();
    }

    public static Date getMonthStartTime(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        if (year != null) {
            calendar.set(Calendar.YEAR, year);
        }
        if (month != null) {
            calendar.set(Calendar.MONTH, month - 1);
        }
        calendar.set(Calendar.DATE, 1);
        return getStartTimeOfDay(calendar);
    }

    public static Date getMonthEndTime(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getMonthStartTime(year, month));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
        calendar.set(Calendar.DATE, 0);
        return getEndTimeOfDay(calendar);
    }

    public static void main(String[] args) throws ParseException {
        // System.out.println(getDate(2017, 1, 13, 0, 0, 0));
        String endDate = "2017-02-19";
        Date sdate = DateUtils.getStartTimeOfWeek(parseDate(endDate, "yyyy-MM-dd"));

        Date edate = DateUtils.parseDate(endDate, "yyyy-MM-dd");
        String startDate = DateUtils.formatDate(sdate, "MM.dd");
    }

    /**
     * 功能描述: 得到下一天的日期
     */
    public static Date getNextDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        return calendar.getTime();
    }

    public static long hoursBetween(Date startDate, Date endDate) {
        long nh = 1000 * 60 * 60;
        return (endDate.getTime() - startDate.getTime()) / nh;
    }

    public static long daysBetween(Date startDate, Date endDate) {
        long nd = 1000 * 24 * 60 * 60;
        String format = "yyyy-MM-dd";
        startDate = formatString(formatDate(startDate, format), format);
        endDate = formatString(formatDate(endDate, format), format);
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        long startTime = cal.getTimeInMillis();
        cal.setTime(endDate);
        long endTime = cal.getTimeInMillis();
        long betweenDays = (endTime - startTime) / nd;
        return Integer.parseInt(String.valueOf(betweenDays));
    }

    public static Date buildDate(Date date, int hour, int minute, int SECOND) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), hour, minute, SECOND);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    public static Date getDate(int year, int month, int day, int hour, int minute, int SECOND) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute, SECOND);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 功能描述: 计算请假时长 （排除节假日、午休，按工作日 8小时计算�?
     *
     * @param startTime
     * @param endTime
     * @return
     * @see [相关�?/方法](可�??)
     * @since [产品/模块版本](可�??)
     */
    private int getWorkHours(Date startTime, Date endTime, List<String> holidays) {
        Long times = 0L;
        long daysBetween = DateUtils.daysBetween(startTime, endTime);
        if (daysBetween > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startTime);
            calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 18, 0, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            times += DateUtils.hoursBetween(startTime, calendar.getTime());

            calendar.setTime(endTime);
            calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 9, 0, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            times += DateUtils.hoursBetween(calendar.getTime(), endTime);

            if (daysBetween > 1) {
                Date nextDay = DateUtils.getNextDay(startTime);
                do {
                    if (!holidays.contains(formatDate(nextDay, "yyyyMMdd"))) {
                        times += 8L;
                    }
                    nextDay = DateUtils.getNextDay(nextDay);
                } while (!DateUtils.formatDate(nextDay, "yyyyMMdd").equals(DateUtils.formatDate(endTime, "yyyyMMdd")));
            }
        } else if (daysBetween == 0) {
            times = DateUtils.hoursBetween(startTime, endTime);
        }

        // 午休时间 12-13
        Date noonBreakStart;
        Date noonBreakEnd;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startTime);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 12, 0, 0);
        noonBreakStart = calendar.getTime();
        calendar.setTime(endTime);
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 13, 0, 0);
        noonBreakEnd = calendar.getTime();
        // 去掉午休时间

        if (daysBetween == 0) {
            if (startTime.before(noonBreakStart) && endTime.after(noonBreakEnd)) {
                times--;
            }
        } else {
            if (startTime.before(noonBreakStart)) {
                times--;
            }
            if (endTime.after(noonBreakEnd)) {
                times--;
            }
        }
        return times.intValue();
    }
}
