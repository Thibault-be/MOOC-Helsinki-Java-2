
package application;

 

public class StandardSensor implements Sensor {

 

    private int value;

 

    public StandardSensor( int  value){

        this.value = value;

    }

 

    @Override

    public boolean isOn(){

        return true;

    }

 

    @Override

    public void setOn(){

        //no effect

    }

 

    public void setOff(){

        //no effect

    }

 

    public int read(){

        return this.value;

    }

   

}