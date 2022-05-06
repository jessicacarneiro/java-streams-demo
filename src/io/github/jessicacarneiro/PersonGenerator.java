package io.github.jessicacarneiro;

import static io.github.jessicacarneiro.collections.AddressCollection.ADDRESSES;
import static io.github.jessicacarneiro.collections.NameCollection.NAMES;

import io.github.jessicacarneiro.vo.Address;
import io.github.jessicacarneiro.vo.Person;
import io.github.jessicacarneiro.vo.PersonName;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PersonGenerator {
  public static final int MAX_LIST_SIZE = 2435;
  private static final int MIN_AGE = 5;
  private static final int MAX_AGE = 99;

  public static ArrayList<Person> generatePersonList(int size) {
    if (size > MAX_LIST_SIZE) {
      throw new IllegalArgumentException(
          "List size maximum is ".concat(String.valueOf(MAX_LIST_SIZE)));
    }

    ArrayList<Person> personList = new ArrayList<>();
    int personInsertedInList = 0;

    while (personInsertedInList < size) {
      PersonName name = NAMES[personInsertedInList];
      int age = ThreadLocalRandom.current().nextInt(MIN_AGE, MAX_AGE + 1);
      List<Address> addresses = List.of(ADDRESSES[personInsertedInList]);

      personList.add(
          new Person(
              name,
              age,
              addresses)
      );

      personInsertedInList++;
    }

    return personList;
  }
}
