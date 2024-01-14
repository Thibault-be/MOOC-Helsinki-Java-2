package application;

 

import java.util.List;

import java.util.ArrayList;

 

public class AverageSensor implements Sensor {

 

    private List<Sensor> sensors;

    private List<Integer> readings;

 

    public AverageSensor(){

        this.sensors = new ArrayList<>();

        this.readings = new ArrayList<>();

 

    }

 

    public void addSensor(Sensor toAdd){

        this.sensors.add(toAdd);

    }

 

    public boolean isOn(){

        for (Sensor sensor : this.sensors){

            if (! sensor.isOn()) return false;

        }

        return true;

    }

 

    public void setOn(){

        for (Sensor sensor : this.sensors){

            sensor.setOn();

        }

    }

 

    public void setOff(){

        for (Sensor sensor : this.sensors){

            sensor.setOff();

        }

       

    }

 

    public int read(){

        if (!this.isOn() || this.sensors.isEmpty()) throw new IllegalStateException("Sensors deactivated or no sensors to read");

 

        int totalReading = 0;

        for (Sensor sensor : this.sensors){

            int newReading = sensor.read();

           

            totalReading += newReading;

        }

        this.readings.add(totalReading / this.sensors.size());

        return totalReading / this.sensors.size();

 

    }

 

    public List<Integer> readings(){

        return this.readings;

    }

 

 

   

}