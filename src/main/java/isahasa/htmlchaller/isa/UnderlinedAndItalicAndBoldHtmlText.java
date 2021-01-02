package isahasa.htmlchaller.isa;

import isahasa.htmlchaller.HtmlText;

public class UnderlinedAndItalicAndBoldHtmlText extends HtmlText {

    public UnderlinedAndItalicAndBoldHtmlText(String plainText) {
        super(plainText);
    }

    @Override
    public String getPlainText() {
        String text = super.getPlainText();
        return "<u><i><b>" + text + "</b></i></u>";
    }
}
