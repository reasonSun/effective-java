package chapter6.item34;

public enum PayrollDaySwitch {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private static final int MINS_PER_SHIFT = 8 * 60;

    int pay(int minutesWorked, int payRate) {
        int basePay = minutesWorked * payRate;

        int overtimePay;
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                overtimePay = basePay / 2;
                break;
            default:
                overtimePay = minutesWorked <= MINS_PER_SHIFT ? 0 : (minutesWorked - MINS_PER_SHIFT) * payRate / 2;
        }

        return basePay + overtimePay;
    }


    public static void main(String[] args) {
        for (PayrollDaySwitch payrollDaySwitch : values())
            System.out.println(payrollDaySwitch+" "+ payrollDaySwitch.pay(8 * 60, 1));
    }
}
