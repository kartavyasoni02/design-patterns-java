package jbr.design.adapter.problem;

public class AdapterPatternProblemMain {
  public static void main(String[] args) {

    FileReader fileReader = new FileReaderImpl();
    fileReader.readFile(".txt");

    System.out.println("\n");
    fileReader.readFile(".pdf");

    System.out.println("\n");
    fileReader.readFile(".doc");
  }
}
