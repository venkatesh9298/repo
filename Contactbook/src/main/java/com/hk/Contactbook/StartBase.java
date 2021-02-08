package com.hk.Contactbook;

import java.util.Scanner;

public class StartBase {
  public void start() {
    while (true) {
      PhoneBook pc = new PhoneBook();
      Scanner scn = new Scanner(System.in);
      System.out.println(" \n\t 1.Add Phonebook entry \n\t 2.get name \n\t 3.exit \n\t ");
      int n = scn.nextInt();
      switch (n) {
        case 1:
          System.out.println("\tenter PhoneNumber and name ");
          String ph1 = scn.next();
          scn.nextLine();
          String na1 = scn.next();
          pc.addDetails(ph1, na1);
          break;
        case 2:
          System.out.println(" \tenter PhoneNumber");
          String ph2 = scn.next();
          pc.getName(ph2);
          break;
        default:
          System.out.println("\tEnter in options only ");
        case 3:
          return;
      }
    }
  }
}
