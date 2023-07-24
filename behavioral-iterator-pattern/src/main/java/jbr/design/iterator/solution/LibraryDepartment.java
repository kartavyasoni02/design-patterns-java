package jbr.design.iterator.solution;

import java.util.ArrayList;
import java.util.List;

import jbr.design.iterator.model.Student;

public class LibraryDepartment implements Department {

  // list of student who are all got book from library.
  private List<Student> issuedTo;

  public LibraryDepartment() {
    issuedTo = new ArrayList<Student>();

    addStudent("Anbu", "CSE", 10001, "chennai", 98439843);
    addStudent("Bala", "IT", 20001, "bangalore", 93343433);
    addStudent("Chandru", "MECH", 30001, "chennai", 98456653);
  }

  public void addStudent(String name, String department, int regNo, String address, long phone) {
    Student student = new Student(name, department, regNo, address, phone);
    issuedTo.add(student);
  }

  /**
   * who are all got this book from library
   */
  @Override
  public StudentIterator getStudents() {
    return new LibraryDepartmentIterator(issuedTo);
  }
}
