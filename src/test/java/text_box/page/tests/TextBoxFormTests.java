package text_box.page.tests;

import text_box.page.page.components.ResultComponent;
import text_box.page.page.TextBoxPageTests;
import org.junit.jupiter.api.Test;



public class TextBoxFormTests extends TestBase {
    TextBoxPageTests textBoxPageTests = new TextBoxPageTests();
    ResultComponent resultComponent = new ResultComponent();
    @Test
    void successfulTextBoxTest() {
        textBoxPageTests.openPage()
                .removeFooterFixedban()
                .setFullName("Иванов Иван Иванович")
                .setEmail("Ivanov@gmail.com")
                .setCurrentAddress("Адрес врем")
                .setPermanentAddress("пост адрес")
                .submit();
        resultComponent.checkOutName("Иванов Иван Иванович")
                .checkOutEmail("Ivanov@gmail.com")
                .checkOutCurrentAddress("Адрес врем")
                .checkOutPermanentAddress("пост адрес");


    }

}
