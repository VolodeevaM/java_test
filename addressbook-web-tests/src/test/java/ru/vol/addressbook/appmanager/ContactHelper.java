package ru.vol.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.vol.addressbook.model.ContactData;

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
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
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

    public void SelectContact() {
        click(By.name("selected[]"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void iniContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void ContactDeletion() {
        wd.switchTo().alert().accept();
    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3", "test1"), true);
        input();
        returnToContactPage();
    }

    public boolean isThereaContact() {
        return isElementPresent(By.name("selected[]"));
    }
}
