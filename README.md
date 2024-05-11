# Collage Database Interface

This Java application provides a simple interface for managing a collage database. It allows users to insert student records and navigate through them.

## Features

- Insert student records with ID, name, and course information.
- Navigate through student records using "First" and "Next" buttons.
- Clear input fields after record insertion.

## Usage

1. **Insert Record:**
    - Enter the student ID, name, and course in the respective text fields.
    - Click the "Insert" button to add the record to the database.

2. **Navigate Records:**
    - Click the "First" button to view the first record in the database.
    - Click the "Next" button to navigate to the next record in the database.

3. **Closing the Application:**
    - Close the application window to exit the program.

## How it Works

- The application is implemented using Java AWT (Abstract Window Toolkit) for creating the graphical user interface (GUI).
- Student records are stored in an ArrayList.
- Each student record consists of an ID, name, and course, represented by the `Student` class.
- The `CollageDatabaseInterface` class extends the `Frame` class and implements the `ActionListener` interface to handle button clicks.
- Input fields and buttons are created using AWT components such as `TextField` and `Button`.
- Records can be inserted using the "Insert" button, and navigation through records is facilitated by the "First" and "Next" buttons.

## Requirements

- Java Development Kit (JDK) installed on your system.
- A Java IDE or compiler to run the application.

## Notes

- This application provides a basic example of GUI programming in Java using AWT.
- It can be extended and enhanced with additional features such as editing and deleting records, saving records to a file, etc.

