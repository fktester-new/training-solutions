package isahasa.htmlchaller.isa;

import isahasa.htmlchaller.HtmlText;

public class ItalicAndBoldHtmlText extends HtmlText {

    public ItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        String text = super.getPlainText();
        return "<i><b>" + text + "</b></i>";
    }
}
