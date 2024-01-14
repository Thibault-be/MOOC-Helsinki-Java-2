
package application;

 

import java.util.Random;

 

public class TemperatureSensor implements Sensor{

 

    private boolean status;

 

    public TemperatureSensor(){

        this.status = false;

    }

 

    @Override

    public boolean isOn(){

        return this.status;

    }

 

    public void setOn(){

        this.status = true;

    }

 

    public void setOff(){

        this.status = false;

    }

 

    public int read(){

        if (this.status){

          Random rand = new Random();

          return rand.nextInt(61) - 30;      

        }

 

        throw new IllegalStateException("The sensor is off");

    }

 

}