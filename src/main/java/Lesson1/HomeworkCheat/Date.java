package Lesson1.HomeworkCheat;

public class Date {
    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        if (!checkDate())
            System.out.println(this + "-Illegal date!");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if (!checkDate())
            System.out.println(this + "-Illegal date!");
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        if (!checkDate())
            System.out.println(this + "-Illegal date!");
    }

    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        this.day = day;
        if (!checkDate())
            System.out.println(this + " -Illegal date!");
    }

    private boolean isLeapYear() {
        if (year % 400 == 0)
            return true;
        if (year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
    }

    private boolean checkDate() {
        if (isLeapYear() && month == 2 && day == 29)
            return true;
        if (month == 2 && (day == 30 || day == 29))
            return false;
        if (month >= 1 && month <= 12 && day >= 1 && day >= 1 && day <= 30)
            return false;
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day == 31)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("%d-%02d-%02d", year, month, day);
    }

    public void addDay()
    {
        //последний день месяца
        //28 февраля високосного года
        Date d1 = new Date(year,month,day+1);
                if(!d1.checkDate())
                {
                    day=1;
                    if(month == 12){
                        year++;
                        month=1;
                    }
                    else
                    month++;
                }
                else
                    day++;
    }

    public static void main(String[] args) {
        Date d = new Date(2022, 1, 9);
        System.out.println(d);
/*
        new Date(2022, 2, 29);
        new Date(2022, 4, 31);
        new Date(2022, 4, 44);
        new Date(2022, 14, 2);

 */
        Date newYear = new Date(2022,12,31);
        newYear.addDay();
        System.out.println(newYear);

        Date testDate = new Date(2022,7,4);
        testDate.addDay();
        System.out.println(testDate);

    }
}
