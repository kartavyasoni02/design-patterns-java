package jbr.design.adapter.solution.composition;

public class FileReaderAdapter {

  AdvancedFileReader advancedFileReader = null;

  public void readFile(String fileType) {
    advancedFileReader = new AdvancedFileReader();

    advancedFileReader.readFileAdvanced(fileType);
  }
}