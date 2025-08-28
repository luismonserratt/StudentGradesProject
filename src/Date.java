public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        if (isValidDate(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    // Validate the date
    private boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > daysInMonth(month, year)) return false;
        return true;
    }

    // Check days in the month
    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2: return isLeapYear(year) ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    // Leap year method
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
