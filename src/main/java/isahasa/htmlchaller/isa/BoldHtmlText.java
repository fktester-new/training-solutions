package isahasa.htmlchaller.isa;

import isahasa.htmlchaller.HtmlText;

public class BoldHtmlText extends HtmlText {

    public BoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        String text = super.getPlainText();
        return "<b>" + text + "</b>";
    }
}
