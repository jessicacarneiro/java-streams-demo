package io.github.jessicacarneiro.vo;

import java.util.List;

public class Person {
  private PersonName personName;
  private int age;
  private List<Address> address;

  public Person(PersonName personName, int age, List<Address> address) {
    this.personName = personName;
    this.age = age;
    this.address = address;
  }
}
