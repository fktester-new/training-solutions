package isahasa.htmlchaller.hasa;

import isahasa.htmlchaller.TextSource;

public abstract class TextDecorator implements TextSource {

    private TextSource textSource;

    public TextDecorator(TextSource textSource) {
        this.textSource = textSource;
    }

    protected TextSource getTextSource() {
        return textSource;
    }
}
