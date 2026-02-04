class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2) {
        int totalMinutes;

        totalMinutes = (t1.hours * 60 + t1.minutes)
                     + (t2.hours * 60 + t2.minutes);

        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }

    void displayTime() {
        System.out.println("Time = " + hours + " hours " + minutes + " minutes");
    }
}

class P11 {
    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(3, 20);
        t2.setTime(2, 50);

        result.addTime(t1, t2);

        result.displayTime();
    }
}
