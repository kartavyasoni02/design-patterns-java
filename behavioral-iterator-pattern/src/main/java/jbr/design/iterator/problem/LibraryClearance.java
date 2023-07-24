package jbr.design.iterator.problem;

import jbr.design.iterator.model.Student;

public class LibraryClearance {

  public void getReport() {
    LibraryDepartment libraryDepartment = new LibraryDepartment();

    for (Student student : libraryDepartment.getStudents()) {
      System.out.println("Reg No: " + student.getRegNo());
      System.out.println("Name: " + student.getName());
      System.out.println("Department: " + student.getDepartment());
      System.out.println("Address: " + student.getAddress());
      System.out.println("Phone: " + student.getPhone());
      System.out.println("\n");
    }
  }
}
