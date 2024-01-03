
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    
    public boolean equals(Object obj){
        //is it the same object
        if (this == obj) return true;

        //is it an instance of
        if (!(obj instanceof LicensePlate)) return false;

        //if yes, cast the object to type LicensePlate
        LicensePlate cast = (LicensePlate) obj;

        //instance variables the same?
        if((this.liNumber.equals(cast.liNumber)) &&
            (this.country.equals(cast.country))
        ){
                return true;
            }

        //if not return false
        return false;
    }

    public int hashCode(){
        
        int country = this.country.hashCode();
        int number = this.liNumber.hashCode();
        
        int hash = 31 * country * number;

        return hash;

    }

}
