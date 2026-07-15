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

    public Student() {

    }

    public Student(String name, int studentId, double[] scores) {
        this.name = name;
        this.studentId = studentId;
        this.scores = scores.clone();
    }

    public Student(String name, int studentId) {
        this(name, studentId, new double[5]);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double[] getScores() {
        return scores.clone();
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
        this.scores = scores.clone();
    }

    public void setPassed(boolean passed) {
        isPassed = passed;
    }
}
