package ru.vol.addressbook.model;

public class ContactData {
    private final String firsttName;
    private final String lastName;
    private final String middleName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String notes;

    public ContactData(String firsttName, String lastName, String middleName, String nickName, String title, String company, String address, String notes) {
        this.firsttName = firsttName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.notes = notes;
    }

    public String getFirsttName() {
        return firsttName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }
}
