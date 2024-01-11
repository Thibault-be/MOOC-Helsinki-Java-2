package FlightControl.ui;

import java.util.Scanner;
import FlightControl.domain.*;
import FlightControl.logic.FlightControl;
import java.util.Collection;


public class UserInterface {

  private Scanner scanner;
  private FlightControl flightControl;

  public UserInterface(FlightControl flightControl, Scanner scanner){
    this.scanner = scanner;
    this.flightControl = flightControl;
  }

  public void start(){
    startAssetControl();
    System.out.println();
    startFlightControl();
    System.out.println();

  }

  public void startAssetControl(){

    System.out.println("Airport Asset Control");
    System.out.println("--------------------");
    System.out.println();

    while (true){
      System.out.println("Choose an action:");
      System.out.println("[1] Add an airplane");
      System.out.println("[2] Add a flight");
      System.out.println("[x] Exit Airport Asset Control");

      System.out.print("> ");
      String answer = this.scanner.nextLine().toLowerCase();

      switch (answer){
        case "1":
          addPlane();
          break;
        case "2":
          addFlight();
          break;

        case "x":
          return;
        default:
          return;
      }


    }

  }

  public void addPlane(){
    System.out.print("Give the airplane id: ");
    String planeId = this.scanner.nextLine();
    System.out.print("Give the airplane capacity: ");
    int capacity = Integer.valueOf(this.scanner.nextLine());
    this.flightControl.addAirplane(planeId, capacity);
  }


  public void addFlight(){
    System.out.print("Give the airplane id:");

    Airplane airplane = null;
    while (airplane == null){
      String planeId = this.scanner.nextLine();
      airplane = this.flightControl.getAirplane(planeId);

      if (airplane == null){
        System.out.println("no airplane with the id " + planeId + ".");
      }
    }

    System.out.print("Give the departure airport id: ");
    String departId = this.scanner.nextLine();

    System.out.print("Give the target airport id: ");
    String destId = this.scanner.nextLine();


    this.flightControl.addFlight(airplane, departId, destId);


  }

  public void startFlightControl(){

    System.out.println("Flight Control");
    System.out.println("------------");
    System.out.println();

    while (true) {
      System.out.println("Choose an action:");
      System.out.println("[1] Print airplanes");
      System.out.println("[2] Print flights");
      System.out.println("[3] Print airplane details");
      System.out.println("[x] Quit");


      System.out.print("> ");
      String answer = this.scanner.nextLine().toLowerCase();

      if (answer.equals("1")){
        printAirplanes();
      } else if (answer.equals("2")) {
        printFlights();
      } else if (answer.equals("3")){
        printAirplaneDetails();
      } else if (answer.equals("x")){
        break;
      }
    }
  }

  public void printAirplanes(){
    Collection<Airplane> planes = this.flightControl.getAirplanes();
    for (Airplane plane : planes){
      System.out.println(plane);
    }
  }

  public void printFlights(){
    Collection<Flight> flights = this.flightControl.getFlights();
    for (Flight flight : flights){
      System.out.println(flight);
      System.out.println();
    }
  }

  public void printAirplaneDetails(){
    System.out.print("Give the airplane id: ");
    Airplane airplane = askForAirplane();

    System.out.println(airplane);
    System.out.println();
  }

  private Airplane askForAirplane(){
    Airplane airplane = null;
    while (airplane == null){
      String id = this.scanner.nextLine();
      airplane = this.flightControl.getAirplane(id);

      if (airplane == null){
        System.out.println("No airplane with the id " + id + ".");
      }
    }
    return airplane;
  }

}
