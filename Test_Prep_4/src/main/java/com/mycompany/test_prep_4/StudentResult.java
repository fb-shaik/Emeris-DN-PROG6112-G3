/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_prep_4;

public abstract class StudentResult
        implements IStudentResult {

    // Variables
    private String studentName;
    private String subject;
    private int mark;

    // Constructor
    public StudentResult(String studentName,
                         String subject,
                         int mark) {

        this.studentName = studentName;
        this.subject = subject;
        this.mark = mark;
    }

    // Get methods
    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    @Override
    public int getMark() {
        return mark;
    }
}