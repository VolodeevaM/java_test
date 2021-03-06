package ru.vol.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.vol.addressbook.model.GroupData;

import java.util.ArrayList;
import java.util.List;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void DeleteSelectedGroup() {
        click(By.name("delete"));
    }

    public void SelectGroup(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }


    public void goToGroupPage() {
        click(By.linkText("groups"));

    }

    public void delete(int index) {
        SelectGroup(index);
        DeleteSelectedGroup();
        returnToGroupPage();
    }

    public void create(GroupData group) {
        initGroupCreation();
        fillGroupForm(group);
        submitGroupCreation();
        returnToGroupPage();
    }

    public void modify(int index, GroupData group) {
        SelectGroup(index);
        initGroupModification();
        fillGroupForm(group);
        submitGroupModification();
        returnToGroupPage();
    }

    public boolean isThereAGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public int getGroupCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> List() {
        List<GroupData> groups = new ArrayList<GroupData>();
            List<WebElement> elements = wd.findElements(By.cssSelector("span.group"));
            for (WebElement element: elements) {
                String name= element.getText();
                int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
                GroupData group = new GroupData().withId(id).withName(name);
                groups.add(group);
            }
            return groups;

    }
}
