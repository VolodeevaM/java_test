package ru.vol.addressbook.model;

import java.util.Objects;

public class ContactData {
    private int id;
    private final String firsttName;
    private final String lastName;
    private final String middleName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String notes;
    private String group;

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactData that = (ContactData) o;
        return Objects.equals(firsttName, that.firsttName) && Objects.equals(lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firsttName, lastName);
    }

    public ContactData(String firsttName, String lastName, String middleName, String nickName, String title, String company, String address, String notes, String group) {
        this.id = Integer.MAX_VALUE;
        this.firsttName = firsttName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.notes = notes;
        this.group = group;
    }

    public ContactData(int id, String firsttName, String lastName, String middleName, String nickName, String title, String company, String address, String notes, String group) {
        this.id = id;
        this.firsttName = firsttName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.notes = notes;
        this.group = group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firsttName='" + firsttName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getId() {
        return id;
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

    public String getGroup() {
        return group;
    }
}
