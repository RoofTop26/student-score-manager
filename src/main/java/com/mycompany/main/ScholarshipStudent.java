/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author DELL
 */
public class ScholarshipStudent extends Student implements CoHocBong {

    private double mucHocBong;

    public ScholarshipStudent(String name, int studentId,
            double[] scores, double mucHocBong) {

        super(name, studentId, scores);
        this.mucHocBong = mucHocBong;
    }

    public double getMucHocBong() {
        return mucHocBong;
    }

    public void setMucHocBong(double mucHocBong) {
        this.mucHocBong = mucHocBong;
    }

    @Override
    public String thongTinHocBong() {
        return "Muc hoc bong: " + mucHocBong;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
