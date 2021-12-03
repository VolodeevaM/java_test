package ru.vol.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "2", "3"));
        submitGroupCreation();
        returnToGroupPage();

    }

}
