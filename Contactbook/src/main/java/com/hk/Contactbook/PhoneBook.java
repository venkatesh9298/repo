package com.hk.Contactbook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

  Map<String, String> map = new HashMap<>();

  void addDetails(String phno, String name) {

    map.put(phno, name);
    System.out.println("it is added");

  }

  void getName(String phno) {
    if (map.containsKey(phno)) {
      System.out.println(phno + "  corresponding name is  " + map.get(phno));
    } else {
      System.out.println("no user");
    }
  }
}
