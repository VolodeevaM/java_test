package ru.vol.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ru.vol.addressbook.model.ContactData;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void returnToContactPage() {
        click(By.linkText("home"));
    }

    public void input() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData,boolean creation) {

        type(By.name("firstname"), contactData.getFirsttName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"),  contactData.getTitle());
        type(By.name("address"),contactData.getAddress());
        type(By.name("company"), contactData.getCompany());
        type(By.name("notes"), contactData.getNotes());

        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByIndex(0);
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }


    }


    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void iniContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void goToContactPage() {
        click(By.name("home page"));
    }

    public void selectContact(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void delete(int index) {
        selectContact(index);
        deleteSelectedContact();
        returnToContactPage();
    }

    public void iniContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void ContactDeletion() {
        wd.switchTo().alert().accept();
    }

    public void create(ContactData contact) {

            initContactCreation();
            fillContactForm(contact, true);

        input();
        returnToContactPage();
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public boolean isThereaContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public List<ContactData> list() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements) {
            List<WebElement> cells = element.findElements(By.tagName("td"));
            int id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
            String firstname = element.getText();
            String lastname = cells.get(1).getText();
            String middlename = cells.get(2).getText();
            ContactData contact = new ContactData("test1", "lastName", "1",
                    "i", "1", "1", "2", "3", "test1");
            contacts.add(contact);
        }
        return contacts;
    }

    public void deleteSelectedContact() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void initContactModification(int index) {
        wd.findElements(By.xpath("//img[@alt='Edit']")).get(index).click();
    }
}
