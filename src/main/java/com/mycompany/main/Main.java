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

// Mảng lưu tối đa 100 sinh viên
Student[] students = new Student[100];
int soLuong = 5;

// ===== Dữ liệu mẫu =====
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

// Tính đạt/không đạt cho dữ liệu mẫu
for (int i = 0; i < soLuong; i++) {

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
System.out.println("2. Them sinh vien");
System.out.println("3. Thoat");
System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

switch (chon) {

    case 1:

        int demDat = 0;
        int demKhongDat = 0;

        for (int k = 0; k < soLuong; k++) {

            Student student = students[k];

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

            if (student.isPassed) {
                System.out.println("Ket qua: Dat");
                demDat++;
            } else {
                System.out.println("Ket qua: Khong dat");
                demKhongDat++;
            }

        }

        System.out.println("----------------------");
        System.out.println("So sinh vien dat: " + demDat);
        System.out.println("So sinh vien khong dat: " + demKhongDat);

        break;

    case 2:

        sc.nextLine();

        while (true) {

            if (soLuong >= students.length) {
                System.out.println("Danh sach da day!");
                break;
            }

            System.out.print("Nhap ten sinh vien (Nhap 'dung' de ket thuc): ");
            String ten = sc.nextLine();

            if (ten.equalsIgnoreCase("dung")) {
                break;
            }

            Student student = new Student();

            student.name = ten;

            System.out.print("Nhap ma sinh vien: ");
            student.studentId = sc.nextInt();

            student.scores = new double[5];

            double tong = 0;

            for (int i = 0; i < 5; i++) {

                System.out.print("Nhap diem mon " + (i + 1) + ": ");
                student.scores[i] = sc.nextDouble();
                tong += student.scores[i];

            }

            double average = tong / 5;

            student.isPassed = average >= DIEM_DAT;

            students[soLuong] = student;
            soLuong++;

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

        }  while (chon != 3);

        sc.close();

    }
}
