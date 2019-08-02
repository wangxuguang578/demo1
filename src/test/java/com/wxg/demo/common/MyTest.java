package com.wxg.demo.common;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyTest {

    @Test
    public void testCaledar() {
        Calendar ca = Calendar.getInstance();
        SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = ca.getTime();
        String nowDate = sf2.format(date2);
        ca.add(Calendar.DAY_OF_MONTH, -1);
        ca.getTime();
        Date date = ca.getTime();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd 16:00:00");
        String todayZero = sf.format(date);
        System.out.println("nowDate=" +nowDate);
        System.out.println("date2=" +date2);
        System.out.println("date=" +date);
        System.out.println("todayZero=" +todayZero);
    }
}
