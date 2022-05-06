package io.github.jessicacarneiro.vo;

public class PersonName {
  private String firstName;
  private String middleName;
  private String lastName;

  public PersonName(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }

  public PersonName(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}
