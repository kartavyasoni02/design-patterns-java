package jbr.design.iterator.solution;

import jbr.design.iterator.model.Student;

public class FinanceDepartmentIterator implements StudentIterator {

  Student[] students;
  int index = 0;

  public FinanceDepartmentIterator(Student[] students) {
    this.students = students;
  }

  @Override
  public boolean hasNext() {
    if (index >= students.length || students[index] == null)
      return false;
    else
      return true;
  }

  @Override
  public Object next() {
    Student student = students[index];
    index = index + 1;

    return student;
  }

}
