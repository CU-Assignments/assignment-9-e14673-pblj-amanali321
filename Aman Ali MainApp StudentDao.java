/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

package com.example.hibernatecrud;

public class MainApp {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        Student s1 = new Student("John", 22);
        dao.saveStudent(s1);

        Student s2 = dao.getStudent(s1.getId());
        System.out.println("Fetched: " + s2.getName());

        s2.setName("Johnny");
        dao.updateStudent(s2);

        dao.deleteStudent(s2);
    }
}
