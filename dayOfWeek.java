/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vidu;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author hieuvannguyen
 */
public class dayOfWeek {

    //Anh cần viết một phương thức getDay trong Java để xác định ngày trong tuần tương ứng với một ngày cụ thể.

    //Đề bài yêu cầu anh sử dụng lớp Calendar trong Java để thực hiện việc này.
    
    public static String getDay(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[dayOfWeek - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        String dayOfWeek = getDay(day, month, year);
        System.out.println(dayOfWeek);
    }
}
