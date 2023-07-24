package jbr.design.iterator.problem;

import jbr.design.iterator.model.Student;

public class FinanceClearance {

  public void getReport() {
    FinanceDeptartment financeDepartment = new FinanceDeptartment();
    Student[] students = financeDepartment.getStudents();

    for (int i = 0; i < students.length; i++) {
      Student student = students[i];
      System.out.println("Reg No: " + student.getRegNo());
      System.out.println("Name: " + student.getName());
      System.out.println("Department: " + student.getDepartment());
      System.out.println("Address: " + student.getAddress());
      System.out.println("Phone: " + student.getPhone());
      System.out.println("\n");
    }
  }
}
