package isahasa.htmlchaller.isa;

import isahasa.htmlchaller.HtmlText;

public class UnderlinedHtmlText extends HtmlText {

    public UnderlinedHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        String text = super.getPlainText();
        return "<u>" + text + "</u>";
    }
}
