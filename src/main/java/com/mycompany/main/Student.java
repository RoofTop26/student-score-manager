/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author DELL
 */
public class Student {

    private String name;
    private int studentId;
    private double[] scores;
    private boolean isPassed;

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double[] getScores() {
        return scores;     
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setScores(double[] scores) {
        this.scores = scores;
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
