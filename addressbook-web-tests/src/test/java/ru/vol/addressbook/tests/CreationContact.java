package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

import java.util.Comparator;
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
        Comparator<? super ContactData> byId = (c1, c2) -> Integer.compare(c1.getId(), c2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);
        Comparator<? super ContactData> bylastName = (f1, f2) -> String.CASE_INSENSITIVE_ORDER.compare(f1.getLastName(),
                f2.getLastName());
        before.sort(bylastName);
        after.sort(bylastName);
        Assert.assertEquals(before, after);
        Comparator<? super ContactData> byfirstname = (l1, l2) -> String.CASE_INSENSITIVE_ORDER.compare(l1.getFirsttName(), l2.getFirsttName());
        before.sort(byfirstname);
        after.sort(byfirstname);
        Assert.assertEquals(before, after);
    }





    }



