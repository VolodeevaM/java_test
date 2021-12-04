package ru.vol.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{

    @Test
    public void TestContactDeletion() {
        app.getContactHelper().SelectContact();
        app.getContactHelper().iniContactDeletion();
        app.getContactHelper().ContactDeletion();
        app.getContactHelper().returnToContactPage();
    }
}
