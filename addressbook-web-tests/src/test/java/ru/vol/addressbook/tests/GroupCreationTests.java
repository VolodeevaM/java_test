package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("test1", null, "3"));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before +1);


    }

}
