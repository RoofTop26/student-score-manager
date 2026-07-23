/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {

        final double DIEM_DAT = 5.0;

        ArrayList<Student> students = new ArrayList<>();

        students.add(new ScholarshipStudent(
                "Nguyen Kim Hieu",
                123456,
                new double[]{8.25, 10, 9.5, 8, 7.5},
                5000000));

        students.add(new Student(
                "Tran Binh An",
                123457,
                new double[]{7, 8, 9, 6, 8}));

        students.add(new Student(
                "Pham Le Thao Nguyen",
                123458,
                new double[]{5, 6, 7, 8, 5}));

        students.add(new Student(
                "Nguyen Trong Hoang",
                123459,
                new double[]{4, 5, 6, 4, 5}));

        students.add(new ScholarshipStudent(
                "Nguyen Tien Dung",
                123460,
                new double[]{9, 9, 10, 8, 9},
                7000000));

        System.out.println(students.get(0));

        for (int i = 0; i < students.size(); i++) {

            double tong = 0;

            for (int j = 0; j < students.get(i).getScores().length; j++) {
                tong += students.get(i).getScores()[j];
            }

            double average = tong / students.get(i).getScores().length;

            students.get(i).setPassed(average >= DIEM_DAT);
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

                    for (Student student : students) {

                        System.out.println("----------------------");
                        System.out.println(student);

                        if (student.isPassed()) {
                            scorePass++;
                        } else {
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

                        System.out.print("Nhap ten sinh vien (Nhap 'dung' de ket thuc): ");
                        String ten = sc.nextLine();

                        if (ten.equalsIgnoreCase("dung")) {
                            break;
                        }

                        System.out.print("Nhap ma sinh vien: ");
                        int maSV = sc.nextInt();

                        double[] scores = new double[5];
                        double sum = 0;

                        for (int i = 0; i < 5; i++) {

                            System.out.print("Nhap diem mon " + (i + 1) + ": ");
                            scores[i] = sc.nextDouble();
                            sum += scores[i];

                        }

                        Student student = new Student(ten, maSV, scores);

                        double average = sum / 5;

                        student.setPassed(average >= DIEM_DAT);

                        students.add(student);

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
