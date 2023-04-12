package com.example.admin;

public class AdminDTO {
  private String id;
  private String pwd;
  private String name;
  private int age;
  private int salary;

  public AdminDTO(String id, String pwd, String name, int age, int salary) {
    this.id = id;
    this.pwd = pwd;
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public String getId() {
    return id;
  }

  public String getPwd() {
    return pwd;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getSalary() {
    return salary;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
