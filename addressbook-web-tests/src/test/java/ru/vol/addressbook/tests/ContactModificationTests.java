package ru.vol.addressbook.tests;

import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {

        app.getContactHelper().SelectContact();
        app.getContactHelper().iniContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
    }
}
