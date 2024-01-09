
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }


    @Override
    public String toString() {
        return name + " " + wage;
    }

    @Override
    public int compareTo(Human dude){
        return dude.wage - this.wage  ;
    }
}


/*
 * You are provided with the class Human.
 * A human has a name and wage information.
 * Implement the interface Comparable in a way, such that the overridden compareTo
 * method sorts the humans according to wage from largest to smallest salary.
 */