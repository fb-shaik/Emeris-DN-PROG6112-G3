/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_prep_4;

public class StudentResultReport
        extends StudentResult {

    // Constructor
    public StudentResultReport(String studentName,
                               String subject,
                               int mark) {

        super(studentName, subject, mark);
    }

    // Display one student's result
    public void printStudentResult() {

        System.out.println(
                getStudentName()
                + " - "
                + getSubject()
                + ": "
                + getMark());
    }
}