package ru.vol.addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    wd.get("http://localhost:8443/addressbook/group.php");
    SelectGroup();
    DeleteSelectedGroup();
    returnToGroupPage();
  }


}
