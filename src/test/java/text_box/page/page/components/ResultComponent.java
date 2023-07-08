package text_box.page.page.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultComponent {
    SelenideElement
    checkName = $("#output #name"),
    checkEmail = $("#output #email"),
    checkCurrentAddress = $("#output #currentAddress"),
    checkPermanentAddress = $("#output #permanentAddress");


    public ResultComponent checkOutName (String value) {
        checkName.shouldHave(text(value));
        return this;
    }
    public ResultComponent checkOutEmail (String value) {
        checkEmail.shouldHave(text(value));
        return this;
    }
    public ResultComponent checkOutCurrentAddress (String value) {
        checkCurrentAddress.shouldHave(text(value));
        return this;
    }
    public void checkOutPermanentAddress (String value) {
        checkPermanentAddress.shouldHave(text(value));
    }
}
