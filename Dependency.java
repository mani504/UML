
class Document{
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class Printer{

    public void printDocument(Document document){
        System.out.println(document.getContent() + " is being printed");
    }
}


public class Dependency {

    public static void main(String[] args) {
        Document document = new Document("Auto-Biography");
        Printer printer = new Printer();
        printer.printDocument(document);
    }

}
