package jbr.design.adapter.solution.inheritance;

public class AdvancedFileReader {

  public void readFileAdvanced(String fileType) {
    if (fileType.equalsIgnoreCase(".docx") || fileType.equalsIgnoreCase(".xlsx")) {
      System.out.println("Success!! Reading advanced file format: " + fileType);
    } else {
      System.out.println("Fail!! Couldn't able to read by Advanced FileReader!!!");
    }
  }
}
