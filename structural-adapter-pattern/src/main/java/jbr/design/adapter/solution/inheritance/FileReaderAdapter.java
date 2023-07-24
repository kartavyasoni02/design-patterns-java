package jbr.design.adapter.solution.inheritance;

public class FileReaderAdapter extends AdvancedFileReader {

  public void readFile(String fileType) {
    readFileAdvanced(fileType);
  }
}