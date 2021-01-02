package isahasa.htmlchaller.isa;

import isahasa.htmlchaller.HtmlText;

public class ItalicHtmlText extends HtmlText {
    public ItalicHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        String text = super.getPlainText();
        return "<i>" + text + "</i>";
    }
}
