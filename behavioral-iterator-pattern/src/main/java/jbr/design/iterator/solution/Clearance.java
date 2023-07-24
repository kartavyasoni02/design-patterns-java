package jbr.design.iterator.solution;

import jbr.design.iterator.model.Student;

public class Clearance {
  public void collectReport(Department financeDepartment, Department libraryDepartment) {
    System.out.println("\nFINANCE REPORTS");
    System.out.println("=========================");
    getReport(financeDepartment.getStudents());

    System.out.println("\nLIBRARY REPORTS");
    System.out.println("=========================");
    getReport(libraryDepartment.getStudents());
  }

  public void getReport(StudentIterator studentIterator) {
    while (studentIterator.hasNext()) {
      Student student = (Student) studentIterator.next();

      System.out.println("Reg No: " + student.getRegNo());
      System.out.println("Name: " + student.getName());
      System.out.println("Department: " + student.getDepartment());
      System.out.println("Address: " + student.getAddress());
      System.out.println("Phone: " + student.getPhone());
      System.out.println("\n");
    }
  }
}
