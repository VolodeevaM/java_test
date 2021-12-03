package ru.vol.addressbook.tests;

import org.testng.annotations.Test;
import ru.vol.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "2", "3"));
        app.submitGroupCreation();
        app.returnToGroupPage();

    }

}
