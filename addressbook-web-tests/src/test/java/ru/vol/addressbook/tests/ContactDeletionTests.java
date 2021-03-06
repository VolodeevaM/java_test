package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

import java.util.List;

public class ContactDeletionTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        app.goTo().contactPage();
        if (app.contact().list().size() == 0) {
            app.contact().create(new ContactData("test1", "lastName",
                    "1", "i", "1", "1", "2", "3", "test1"));
        }
    }

    @Test
    public void TestContactDeletion() {

        List<ContactData> before = app.contact().list();
        int index = before.size()-1;
        app.contact().delete(index);
        List<ContactData> after = app.contact().list();
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(index);
        Assert.assertEquals(before, after);


    }


}

