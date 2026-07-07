/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author DELL
 */
public class Main {
public static void main(String[] args) {
        Student student = new Student();

        student.name = "Nguyen Kim Hieu";
        student.studentId = 123456;

        student.scores = new double[]{6, 7, 9.5};

        double average = (student.scores[0] + student.scores[1] + student.scores[2]) / 3;

        int averageInt = (int) average;
        final double DIEM_DAT = 5.0;
        student.isPassed = average >= DIEM_DAT;

        System.out.println("Ten: " + student.name);
        System.out.println("Ma SV: " + student.studentId);
        System.out.println("Diem TB: " + average);
        System.out.println("So sanh ep: " + averageInt);
        System.out.println("Dat: " + student.isPassed);

    }
}
