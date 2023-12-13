public class Time {
    private int hours;
    private int minutes;
    private int seconds;


    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void tick(){
        seconds++;
        timeFormat();
    }

    public void add(Time otherTime) {
        hours += otherTime.hours;
        minutes += otherTime.minutes;
        seconds += otherTime.seconds;

        if (seconds >= 60) {
            seconds -= 60;
            minutes++;
        }
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
        if (hours >= 24) {
            hours -= 24;
        }
    }

    public String info(){
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    private void timeFormat(){
        if (seconds == 60){
            minutes++;
            seconds = 0;
            if (minutes == 60){
                hours++;
                minutes = 0;
                if (hours == 24){
                    hours = 0;
                }
            }
        }
    }
}
