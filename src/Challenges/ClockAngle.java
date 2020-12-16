package Challenges;
import static java.lang.Math.abs;

// Given two integers, an hour and a minute, write a function to calculate the shortest angle
// between the two hands on a clock representing that time

// can create a scanner to let user choose own time in terminal

public class ClockAngle {

    public static double angle (double hourDegrees, double minuteDegrees){
        // calculate difference in angles
        double angle = abs(hourDegrees - minuteDegrees);

        // get shortest angle possible between the two hands
        if (angle > 180){
            angle = 360 - angle;
        }

        return angle;
    }

    public static double degreeHours (double hour){
        // each hour is 30 degrees
        double degreesPerHour = 30;
        hour = hour * degreesPerHour;
        return hour;
    }

    public static double degreeMinute (double minute){
        // each minute is 6 degrees
        double degreesPerMin = 6;
        minute = minute * degreesPerMin;
        return minute;
    }

    public static void main(String[] args) {
        // input time you want to test
        double minutesInHour = 60;
        double minute = 40;
        double hour = 3 + (minute / minutesInHour);

        // get degrees for your input hour and minutes
        double hourDegrees = degreeMinute(minute);
        double minuteDegrees = degreeHours(hour);

        System.out.println(angle(hourDegrees, minuteDegrees));

    }
}