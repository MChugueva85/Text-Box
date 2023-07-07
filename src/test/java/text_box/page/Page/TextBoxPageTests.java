package text_box.page.Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TextBoxPageTests {
    SelenideElement
            fullNameInput = $("#userName"),
            emailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),

    Submit = $("#submit");

    public TextBoxPageTests openPage() {
        open("/text-box");

        return this;
    }
    public TextBoxPageTests removeFooterFixedban() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }
    public TextBoxPageTests setFullName(String value) {
        fullNameInput.setValue(value);

        return this;
    }

    public TextBoxPageTests setEmail(String value) {
        emailInput.setValue(value);

        return this;
    }

    public TextBoxPageTests setCurrentAddress(String value) {
        currentAddressInput.setValue(value);

        return this;
    }

    public TextBoxPageTests setPermanentAddress(String value) {
        permanentAddressInput.setValue(value);

        return this;
    }

    public void submit() {
        Submit.click();

    }
}
