package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.List;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() throws Exception {

        app.group().goToGroupPage();
        List<GroupData> before = app.group().List();

        GroupData group = new GroupData().withName("test2");
        app.group().create(group);
        List<GroupData> after = app.group().List();

        Assert.assertEquals(after.size(), before.size()+1);



        before.add(group);
        Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before, after);



    }

}
