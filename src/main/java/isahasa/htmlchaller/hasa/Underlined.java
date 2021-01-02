package isahasa.htmlchaller.hasa;

import isahasa.htmlchaller.TextSource;

public class Underlined extends TextDecorator{

    private TextSource textSource;

    public Underlined(TextSource textSource) {
        super(textSource);
    }

    @Override
    public String getPlainText() {
        return "<u>" + getTextSource().getPlainText() + "</u>";
    }
}
