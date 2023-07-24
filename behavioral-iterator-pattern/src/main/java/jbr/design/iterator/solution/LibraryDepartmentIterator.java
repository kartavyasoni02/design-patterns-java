package jbr.design.iterator.solution;

import java.util.List;

import jbr.design.iterator.model.Student;

public class LibraryDepartmentIterator implements StudentIterator {
  List<Student> students;
  int index = 0;

  public LibraryDepartmentIterator(List<Student> students) {
    this.students = students;
  }

  @Override
  public boolean hasNext() {
    if (index < students.size())
      return true;
    else
      return false;
  }

  @Override
  public Object next() {
    Student student = students.get(index);
    index = index + 1;

    return student;
  }

}
