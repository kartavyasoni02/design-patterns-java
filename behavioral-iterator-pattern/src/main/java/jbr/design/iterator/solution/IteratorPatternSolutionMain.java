package jbr.design.iterator.solution;

public class IteratorPatternSolutionMain {

  public static void main(String[] args) {
    Clearance clearance = new Clearance();
    clearance.collectReport(new FinanceDepartment(), new LibraryDepartment());
  }
}
