package chapter8.item50;

import java.util.Date;

public class PeriodAttack {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
//        end.setYear(78);
        p.end().setYear(78);
        System.out.println(p.end());
    }
}
