package ru.vol.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    app.wd.get("http://localhost:8443/addressbook/group.php");
    app.selectGroup();
    app.deleteGroup();
    app.returnToGroupPage();
  }


}
