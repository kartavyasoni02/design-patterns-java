package jbr.design.iterator.solution;

import jbr.design.iterator.model.Student;

public class FinanceDepartment implements Department {

  static final int MAX_STUDENTS = 2;
  int noOfStudents = 0;

  // students who are all yet to pay the fees.
  Student[] feesBalance;

  public FinanceDepartment() {
    feesBalance = new Student[MAX_STUDENTS];

    addStudent("Anbu", "CSE", 10001, "chennai", 98439843);
    addStudent("Bala", "IT", 20001, "bangalore", 93343433);
  }

  public void addStudent(String name, String department, int regNo, String address, long phone) {
    Student student = new Student(name, department, regNo, address, phone);

    if (noOfStudents >= MAX_STUDENTS) {
      System.out.println("Sorry maximum students reached. Pay Attention!!!");
    } else {
      feesBalance[noOfStudents] = student;
      noOfStudents = noOfStudents + 1;
    }
  }

  /**
   * who are all got this book from library
   */
  @Override
  public StudentIterator getStudents() {
    return new FinanceDepartmentIterator(feesBalance);
  }

}
