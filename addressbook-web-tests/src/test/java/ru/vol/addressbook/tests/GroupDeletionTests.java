package ru.vol.addressbook.tests;

import org.testng.annotations.Test;
import ru.vol.addressbook.model.GroupData;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getGroupHelper().goToGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test1", null, "3"));
    }
    app.getGroupHelper().SelectGroup();
    app.getGroupHelper().DeleteSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }


}
