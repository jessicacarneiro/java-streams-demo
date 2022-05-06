package io.github.jessicacarneiro.vo;

public class Address {
  private String street;
  private String city;
  private String state;
  private int number;
  private boolean commercial;

  public Address(String street, String city, String state, int number, boolean commercial) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.number = number;
    this.commercial = commercial;
  }
}
