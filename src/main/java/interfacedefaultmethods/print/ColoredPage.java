package interfacedefaultmethods.print;

public final class ColoredPage {

    private String content;
    private String color;

    public ColoredPage(String content, String color) {
        this.content = content;
        this.color = color;
    }

    public ColoredPage(String content){
        this.content = content;
        this.color = Printable.BLACK;
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }
}
