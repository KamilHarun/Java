package entity;

import java.text.MessageFormat;

public class Student {
    private String name;
    private String surname;
    private Integer age;
    private Integer id;
    private Integer pin;
    private String  password;
    private boolean isActive = true;

    public Student() {
    }

    public Student(String name, String surname, Integer age, Integer pin, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pin = pin;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return MessageFormat.format
                ("Student'{'name=''{0}'', surname=''{1}'', age={2}, id={3}, pin={4}, password=''{5}'', isActive={6}'}'"
                        , name, surname, age, id, pin, password, isActive);
    }
}
