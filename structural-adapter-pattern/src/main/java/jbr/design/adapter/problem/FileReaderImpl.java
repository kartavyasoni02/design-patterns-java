package jbr.design.adapter.problem;

public class FileReaderImpl implements FileReader {

  public void readFile(String fileType) {
    System.out.println("File Type is: " + fileType);

    if (fileType.equalsIgnoreCase(".txt") || fileType.equalsIgnoreCase(".pdf")) {
      System.out.println("Reading the file format : " + fileType);
    } else {
      System.out.println("ERROR..Invalid File Format, Couldn't Read!!!");
    }
  }
}