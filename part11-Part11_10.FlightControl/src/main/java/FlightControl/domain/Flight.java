package FlightControl.domain;

public class Flight {

  private Airplane plane;
  private Place departureAirport;
  private Place destinationAirport;

  public Flight(Airplane plane, Place departureAirport, Place destinationAirport){
    this.plane = plane;
    this.departureAirport = departureAirport;
    this.destinationAirport = destinationAirport;
  }

  public Airplane getAirplane(){
    return this.plane;
  }

  public Place getDeparture(){
    return this.departureAirport;
  }

  public Place getDestinationAirport(){
    return this.destinationAirport;
  }

  @Override
  public String toString(){
    return this.plane.toString() + " (" + this.departureAirport + "-" + this.destinationAirport + ")";
  }
  
}
