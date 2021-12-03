package ru.vol.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.SelectGroup();
    app.DeleteSelectedGroup();
    app.returnToGroupPage();
  }


}
