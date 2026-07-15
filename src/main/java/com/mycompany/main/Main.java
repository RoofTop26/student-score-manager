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

        Student[] students = new Student[100];
        int Number = 5;

        students[0] = new Student();
        students[0].setName("Nguyen Kim Hieu");
        students[0].setStudentId(123456);
        students[0].setScores(new double[]{8.25, 10, 9.5, 8, 7.5});

        students[1] = new Student();
        students[1].setName("Tran Binh An");
        students[1].setStudentId(123457);
        students[1].setScores(new double[]{7, 8, 9, 6, 8});

        students[2] = new Student();
        students[2].setName("Pham Le Thao Nguyen");
        students[2].setStudentId(123458);
        students[2].setScores(new double[]{5, 6, 7, 8, 5});

        students[3] = new Student();
        students[3].setName("Nguyen Trong Hoang");
        students[3].setStudentId(123459);
        students[3].setScores(new double[]{4, 5, 6, 4, 5});

        students[4] = new Student();
        students[4].setName("Nguyen Tien Dung");
        students[4].setStudentId(123460);
        students[4].setScores(new double[]{9, 9, 10, 8, 9});

        double[] diemTest = students[0].getScores();

        System.out.println("Diem truoc khi sua: " + students[0].getScores()[0]);

        diemTest[0] = 100;

        System.out.println("Diem sau khi sua: " + students[0].getScores()[0]);

        for (int i = 0; i < Number; i++) {
            double tong = 0;

            for (int j = 0; j < students[i].getScores().length; j++) {
                tong += students[i].getScores()[j];
            }

            double average = tong / students[i].getScores().length;

            students[i].setPassed(average >= DIEM_DAT);
        }

        Scanner sc = new Scanner(System.in);

        int chon;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Xem danh sach");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {

                case 1:

                    int scorePass = 0;
                    int scoreFail = 0;

                    for (int k = 0; k < Number; k++) {

                        Student student = students[k];

                        System.out.println("----------------------");
                        System.out.println("Ten: " + student.getName());
                        System.out.println("Ma SV: " + student.getStudentId());

                        double tong = 0;
                        int mon = 1;

                        for (double diem : student.getScores()) {

                            System.out.println("Mon " + mon + ": " + diem);
                            tong += diem;
                            mon++;

                        }

                        double average = tong / student.getScores().length;

                        System.out.println("Diem TB: " + average);

                        if (student.isPassed()) {
                            System.out.println("Ket qua: Dat");
                            scorePass++;
                        } else {
                            System.out.println("Ket qua: Khong dat");
                            scoreFail++;
                        }

                    }

                    System.out.println("----------------------");
                    System.out.println("So sinh vien dat: " + scorePass);
                    System.out.println("So sinh vien khong dat: " + scoreFail);

                    break;

                case 2:

                    sc.nextLine();

                    while (true) {

                        if (Number >= students.length) {
                            System.out.println("Danh sach da day!");
                            break;
                        }

                        System.out.print("Nhap ten sinh vien (Nhap 'dung' de ket thuc): ");
                        String ten = sc.nextLine();

                        if (ten.equalsIgnoreCase("dung")) {
                            break;
                        }

                        Student student = new Student();

                        student.setName(ten);

                        System.out.print("Nhap ma sinh vien: ");
                        student.setStudentId(sc.nextInt());

                        double[] scores = new double[5];
                        double sum = 0;
                        for (int i = 0; i < 5; i++) {

                            System.out.print("Nhap diem mon " + (i + 1) + ": ");
                            scores[i] = sc.nextDouble();
                            sum += scores[i];

                        }

                        student.setScores(scores);

                        double average = sum / 5;

                        student.setPassed(average >= DIEM_DAT);

                        students[Number] = student;
                        Number++;

                        sc.nextLine();

                        System.out.println("Them sinh vien thanh cong!");
                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.println("End");
                    break;

                default:

                    System.out.println("Lua chon khong hop le!");

            }

        } while (chon != 3);

        sc.close();
    }
}
