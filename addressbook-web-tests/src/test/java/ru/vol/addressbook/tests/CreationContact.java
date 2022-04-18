package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

import java.util.HashSet;
import java.util.List;

public class CreationContact extends TestBase{



    @Test
    public void testCreationContact() throws Exception {

        List<ContactData> before = app.getContactHelper().getContactList();
        ContactData contact = new ContactData("test1", "lastName", "1", "i", "1",
                "1", "2", "3", null);
        app.getContactHelper().createContact(contact);
        app.getContactHelper().returnToContactPage();

        List<ContactData> after = app.getContactHelper().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);

        before.add(contact);
        int max = 0;
        for (ContactData g : after) {
            if(g.getId()> max) {
                max = g.getId();
            }
        }
        contact.setId(max);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));


    }


}
