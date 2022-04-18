package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        int before = app.getContactHelper().getContactCount();
        if (!app.getContactHelper().isThereaContact()) {
            app.getContactHelper().createContact(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3", "test1"));
        }
        app.getContactHelper().SelectContact();
        app.getContactHelper().iniContactModification();
        app.getContactHelper().fillContactForm(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToContactPage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before );
    }
}
