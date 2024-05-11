/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collagedatabaseapp;

/**
 *
 * @author pc
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    String course;

    Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}

public class CollageDatabaseInterface extends Frame implements ActionListener {
    TextField idField, nameField, courseField;
    Button insertButton, firstButton, nextButton;

    ArrayList<Student> students;
    int currentIndex;

    CollageDatabaseInterface() {
        students = new ArrayList<>();
        currentIndex = 0;
        initComponents();
    }

    void initComponents() {
        setTitle("Collage Database");
        setSize(400, 200);
        setLayout(null);

        Label idLabel = new Label("ID:");
        idLabel.setBounds(20, 40, 50, 20);
        add(idLabel);

        idField = new TextField();
        idField.setBounds(100, 40, 150, 20);
        add(idField);

        Label nameLabel = new Label("Name:");
        nameLabel.setBounds(20, 70, 50, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(100, 70, 150, 20);
        add(nameField);

        Label courseLabel = new Label("Course:");
        courseLabel.setBounds(20, 100, 50, 20);
        add(courseLabel);

        courseField = new TextField();
        courseField.setBounds(100, 100, 150, 20);
        add(courseField);

        insertButton = new Button("Insert");
        insertButton.setBounds(20, 140, 80, 30);
        insertButton.addActionListener(this);
        add(insertButton);

        firstButton = new Button("First");
        firstButton.setBounds(220, 140, 80, 30);
        firstButton.addActionListener(this);
        add(firstButton);

        nextButton = new Button("Next");
        nextButton.setBounds(320, 140, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        setVisible(true);

        // Add the window closing event
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "Insert":
                insertRecord();
                break;
            case "First":
                showRecord(0);
                break;
            case "Next":
                showNextRecord();
                break;
        }
    }

    void insertRecord() {
        int id = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String course = courseField.getText();

        students.add(new Student(id, name, course));
        System.out.println("Record inserted successfully.");
        clearFields();
    }

    void showRecord(int index) {
        if (index >= 0 && index < students.size()) {
            Student student = students.get(index);
            idField.setText(String.valueOf(student.id));
            nameField.setText(student.name);
            courseField.setText(student.course);
            currentIndex = index;
        } else {
            System.out.println("No records available.");
        }
    }

    void showNextRecord() {
        if (currentIndex < students.size() - 1) {
            showRecord(currentIndex + 1);
        } else {
            System.out.println("No next record available.");
        }
    }

    void clearFields() {
        idField.setText("");
        nameField.setText("");
        courseField.setText("");
    }

    }

