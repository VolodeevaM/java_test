package ru.vol.addressbook.tests;

import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

public class CreationContact extends TestBase{



    @Test
    public void testCreationContact() throws Exception {
        app.initContactCreation();
        app.fillContactForm(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3"));
        app.input();
        app.returnToContactPage();
    }


}
