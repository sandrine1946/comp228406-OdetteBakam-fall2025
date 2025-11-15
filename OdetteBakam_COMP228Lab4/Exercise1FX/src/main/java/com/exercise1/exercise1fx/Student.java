package com.exercise1.exercise1fx;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name, address, city, province, postalCode, phone, email, major;
    private final List<String> courses = new ArrayList<>();
    private final List<String> activities = new ArrayList<>();

    public Student() {}

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getPostalCode() { return postalCode; }
    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public List<String> getCourses() { return courses; }
    public void addCourse(String c) { courses.add(c); }

    public List<String> getActivities() { return activities; }
    public void addActivity(String a) { activities.add(a); }
}