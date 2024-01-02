
public class Main {

    public static void main(String[] args) {
        // make test programs here
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}


/*
The exercise template contains a class SimpleDate,
 which defines a date object based on a given day, month, and year.
 In this exercise you will expand the SimpleDate class with an equals method, 
 which can tell if the dates are exactly the same.

Create a method public boolean equals(Object object) for the SimpleDate class, which returns true if the date of the object passed to the method as a parameter is the same as the date of the object used to call the method.

The method should work as follows:

SimpleDate d = new SimpleDate(1, 2, 2000);
System.out.println(d.equals("heh")); false
System.out.println(d.equals(new SimpleDate(5, 2, 2012))); false
System.out.println(d.equals(new SimpleDate(1, 2, 2000))); true
 */