package com.gmail.olgabots.itacademy.lesson.five;

class TimeInterval {
    public static final int COUNT_SECONDS_PER_HOUR = 120;
    public static final int COUNT_SECONDS_PER_MINUTE = 60;
    private int hours;
    private int minutes;
    private int seconds;

    TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    protected TimeInterval(int seconds) {
        this.hours = seconds / COUNT_SECONDS_PER_HOUR;
        this.minutes = (seconds - hours * COUNT_SECONDS_PER_HOUR) / COUNT_SECONDS_PER_MINUTE;
        this.seconds = seconds - hours * COUNT_SECONDS_PER_HOUR - minutes * COUNT_SECONDS_PER_MINUTE;
    }

    private int getIntervalInSeconds() {
        return hours * COUNT_SECONDS_PER_HOUR + minutes * COUNT_SECONDS_PER_MINUTE + seconds;


    }

    public int compareTo(TimeInterval interval) {

        if (this.hours > interval.hours) {
            return 1;
        } else if (this.hours == interval.hours) {
            if (this.minutes > interval.minutes) {
                return 1;
            } else if (this.minutes == interval.minutes) {
                if (this.seconds > interval.seconds) {
                    return 1;
                }else if(this.seconds == interval.minutes){
                    return 0;
                }
                return -1;
            }
        }

        return -1;
    }

    public String toString() {
        return String.format("Interval [hh:mm:ss] is [%02d:%02d:%02d]", hours, minutes, seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
