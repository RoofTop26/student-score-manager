/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
public static void main(String[] args) {
           final double DIEM_DAT = 5.0;

        Student[] students = new Student[5];

        students[0] = new Student();
        students[0].name = "Nguyen Kim Hieu";
        students[0].studentId = 123456;
        students[0].scores = new double[]{8.25, 10, 9.5, 8, 7.5};

        students[1] = new Student();
        students[1].name = "An";
        students[1].studentId = 123457;
        students[1].scores = new double[]{7, 8, 9, 6, 8};

        students[2] = new Student();
        students[2].name = "Binh";
        students[2].studentId = 123458;
        students[2].scores = new double[]{5, 6, 7, 8, 5};

        students[3] = new Student();
        students[3].name = "Cuong";
        students[3].studentId = 123459;
        students[3].scores = new double[]{4, 5, 6, 4, 5};

        students[4] = new Student();
        students[4].name = "Dung";
        students[4].studentId = 123460;
        students[4].scores = new double[]{9, 9, 10, 8, 9};

        // Tính điểm trung bình bằng for
        for (int i = 0; i < students.length; i++) {

            double tong = 0;

            for (int j = 0; j < students[i].scores.length; j++) {
                tong += students[i].scores[j];
            }

            double average = tong / students[i].scores.length;

            students[i].isPassed = average >= DIEM_DAT;
        }

        Scanner sc = new Scanner(System.in);

        int chon;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {

                case 1:

                    // for-each
                    for (Student student : students) {

                        System.out.println("----------------------");
                        System.out.println("Ten: " + student.name);
                        System.out.println("Ma SV: " + student.studentId);

                        double tong = 0;
                        int mon = 1;

                        for (double diem : student.scores) {
                            System.out.println("Mon " + mon + ": " + diem);
                            tong += diem;
                            mon++;
                        }

                        double average = tong / student.scores.length;

                        System.out.println("Diem TB: " + average);
                        System.out.println("Dat: " + student.isPassed);
                    }

                    // while
                    int i = 0;
                    int dem = 0;

                    while (i < students.length) {

                        if (students[i].isPassed) {
                            dem++;
                        }

                        i++;
                    }

                    System.out.println("So sinh vien dat: " + dem);

                    break;

                case 2:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 2);

        sc.close();

    }
}
