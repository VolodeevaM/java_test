package ru.vol.addressbook;

import org.testng.annotations.Test;

public class CreationContact extends TestBase{



    @Test
    public void testCreationContact() throws Exception {
        initContactCreation();
        fillContactForm(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3"));
        input();
        returnToContactPage();
    }


}
