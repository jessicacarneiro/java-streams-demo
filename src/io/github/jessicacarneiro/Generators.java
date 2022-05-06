package io.github.jessicacarneiro;

import static io.github.jessicacarneiro.collections.AddressCollection.ADDRESSES;
import static io.github.jessicacarneiro.collections.NameCollection.NAMES;

import io.github.jessicacarneiro.vo.Address;
import io.github.jessicacarneiro.vo.Person;
import io.github.jessicacarneiro.vo.PersonName;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Generators {
  public static final int MAX_LIST_SIZE = 2435;
  private static final int MIN_AGE = 5;
  private static final int MAX_AGE = 99;

  private static final String MAX_LIST_SIZE_ERROR_MESSAGE =
      "List size maximum is ".concat(String.valueOf(MAX_LIST_SIZE));

  public static List<PersonName> generateNameList(int size) {
    checkListSizeArgument(size);

    ArrayList<PersonName> nameList = new ArrayList<>();

    while (nameList.size() < size) {
      nameList.add(NAMES[nameList.size()]);
    }

    return nameList;
  }

  public static List<Address> generateAddressList(int size) {
    checkListSizeArgument(size);

    ArrayList<Address> addressList = new ArrayList<>();

    while (addressList.size() < size) {
      addressList.add(ADDRESSES[addressList.size()]);
    }

    return addressList;
  }

  public static List<Person> generatePeopleList(int size) {
    checkListSizeArgument(size);

    ArrayList<Person> peopleList = new ArrayList<>();

    while (peopleList.size() < size) {
      peopleList.add(
          new Person(
              NAMES[peopleList.size()],
              ThreadLocalRandom.current().nextInt(MIN_AGE, MAX_AGE + 1),
              List.of(ADDRESSES[peopleList.size()])));
    }

    return peopleList;
  }

  private static void checkListSizeArgument(int size) {
    if (size > MAX_LIST_SIZE) {
      throw new IllegalArgumentException(MAX_LIST_SIZE_ERROR_MESSAGE);
    }
  }
}
