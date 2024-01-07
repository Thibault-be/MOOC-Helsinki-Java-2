
public class Main {

    public static void main(String[] args) {
        // test your classes here
    Box box = new Box(10);

    box.add(new Box(5));
    box.add(box);

    System.out.println(box);
    }

}
