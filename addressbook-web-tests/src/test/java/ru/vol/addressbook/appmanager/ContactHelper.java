package ru.vol.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.vol.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{


    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void returnToContactPage() {
        click(By.linkText("home page"));
    }

    public void input() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirsttName());
        type(By.name("lastname"),contactData.getLastName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"),  contactData.getTitle());
        type(By.name("address"),contactData.getAddress());
        type(By.name("company"), contactData.getCompany());
        type(By.name("notes"), contactData.getNotes());

    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }
}
