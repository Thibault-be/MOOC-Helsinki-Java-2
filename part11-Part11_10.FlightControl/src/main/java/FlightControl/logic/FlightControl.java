package FlightControl.logic;

import java.util.HashMap;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
import java.util.ArrayList;


public class FlightControl {

  private HashMap<String, Airplane> planes;
  private HashMap<String, Flight> flights;
  private HashMap<String, Place> places;
  

  public FlightControl(){
    this.planes = new HashMap<>();
    this.flights = new HashMap<>();
    this. places = new HashMap<>();

  }

  public void addAirplane(String id, int capacity){
    this.planes.putIfAbsent(id, new Airplane(id, capacity));
  }

  public void addFlight(Airplane plane, String departureID, String destinationID){
    
    this.places.putIfAbsent(departureID, new Place(departureID)); 
    this.places.putIfAbsent(destinationID, new Place(destinationID));
    
    Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
    this.flights.put(flight.toString(), flight);
  }

  public Collection<Airplane> getAirplanes(){
    return this.planes.values();
  }

  public Collection<Flight> getFlights() {
    return this.flights.values();
  }


  public Airplane getAirplane(String id){
    return this.planes.get(id);
  }

}
