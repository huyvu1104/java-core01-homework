package btvnlesson5;

import java.util.Scanner;

public class BTVNLesson5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("day: ");
        int day = sc.nextInt();
        System.out.println("month: ");
        int month = sc.nextInt();
        System.out.println("year: ");
        int year = sc.nextInt();
        System.out.println("hour: ");
        int hour = sc.nextInt();
        System.out.println("min: ");
        int min = sc.nextInt();
        System.out.println("sec: ");
        int sec = sc.nextInt();
        System.out.println("s: ");
        int s = sc.nextInt();
        System.out.println("currentTime: " +currentTime(hour, min, sec));
        

        System.out.println("nextTime: " + nextTime(currentTime(hour, min, sec), s));

        if (isValidDay(day, month, year)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

    }

    static boolean laNamNhuan(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0 || year % 100 > 0) {
                return true;

            }
        }
        return false;

    }

    static int SoNgayTrongThang(int month, int year) {
        int NumOfDays = 0;

        switch (month) {
            case 1:
                NumOfDays = 31;
                break;
            case 3:
                NumOfDays = 31;
                break;
            case 5:
                NumOfDays = 31;
                break;
            case 7:
                NumOfDays = 31;
                break;
            case 8:
                NumOfDays = 31;
                break;
            case 10:
                NumOfDays = 31;
                break;
            case 12:
                NumOfDays = 31;
                break;
            case 4:
                NumOfDays = 30;
                break;
            case 6:
                NumOfDays = 30;
                break;
            case 9:
                NumOfDays = 30;
                break;
            case 11:
                NumOfDays = 30;
                break;
            case 2:
                if (laNamNhuan(year)) {
                    NumOfDays = 29;
                } else {
                    NumOfDays = 28;
                }
                break;
            
        }

        return NumOfDays;
    }

    static boolean isValidDay(int day, int month, int year) {
        if (year < 0) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > SoNgayTrongThang(month, year)) {
            return false;
        }

        return true;
    }

    static String currentTime(int hour, int min, int sec) {
        return String.valueOf(hour)+":"+String.valueOf(min)+":"+String.valueOf(sec);
        
    }

    static String nextTime(String currentTime, int s) {
        int hour= Integer.valueOf(currentTime.substring(0, currentTime.indexOf(":")));
        int min= Integer.valueOf(currentTime.substring(currentTime.indexOf(":")+1, currentTime.lastIndexOf(":")));
        int sec= Integer.valueOf(currentTime.substring(currentTime.lastIndexOf(":")+1, currentTime.length()));
        sec = sec + s;

        if (sec > 59) {
            min = min + sec / 60;
            sec = sec % 60;

            if (min > 59) {
                hour = hour + min / 60;
                min = min % 60;
                if (hour > 23) {
                    hour = hour % 24;
                }
            }
        }
        return String.valueOf(hour) + ":" + String.valueOf(min) + ":" + String.valueOf(sec);
    }
}
