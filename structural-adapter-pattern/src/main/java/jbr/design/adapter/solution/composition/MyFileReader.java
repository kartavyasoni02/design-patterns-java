package jbr.design.adapter.solution.composition;

public class MyFileReader implements FileReader {
  FileReaderAdapter fileReaderAdapter = new FileReaderAdapter();

  public void readFile(String fileType) {
    System.out.println("File Type is: " + fileType);

    if (fileType.equalsIgnoreCase(".txt") || fileType.equalsIgnoreCase(".pdf")) {
      System.out.println("Success!! Reading the file format : " + fileType);
    } else {
      fileReaderAdapter.readFile(fileType);
    }
  }

}
