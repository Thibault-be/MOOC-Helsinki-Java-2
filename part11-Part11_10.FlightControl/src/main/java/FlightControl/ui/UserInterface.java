package FlightControl.ui;

import java.util.Scanner;

public class UserInterface {

  private Scanner scanner;

  public UserInterface(Scanner scanner){
    this.scanner = scanner;
  }

  public void start(){


    while (true){
      System.out.println("Choose an action:");
      System.out.println("[1] Add an airplaine");
      System.out.println("[2] Add a flight");
      System.out.println("[x] Exit Airport Asset Control");

      String userChoice = this.scanner.nextLine().toLowerCase();

      switch (userChoice){

        case "1":

        case "2":

        case "x":

      }

    }

  }
}
