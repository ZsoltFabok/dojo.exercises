package dojo.jmock;

public class Capitalizer {
  private Document document;

  public Capitalizer(Document document) {
    this.document = document;
  }

  public String convertToOneLine() {
    String line;
    StringBuilder content = new StringBuilder();
    while ((line = document.readLine()) != null) {
      content.append(line.toUpperCase());
    }
    return content.toString();
  }
}