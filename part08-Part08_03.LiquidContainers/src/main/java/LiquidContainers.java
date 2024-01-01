
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {

            int firstContent = first.getContent();
            int secondContent = second.getContent();

            System.out.println("First: " + firstContent+"/100");
            System.out.println("Second: " + secondContent + "/100");

            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int volume = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                first.add(volume);
               
            } else if (command.equals("move")){
                int firstContentMove = first.getContent();
        
                if (volume > firstContentMove){
                    second.add(firstContentMove);
                    first.setContent(0);  
                    continue;                
                }

                first.setContent(firstContent - volume);
                second.add(volume);

            } else if (command.equals("remove")){
                 if (volume > second.getContent()){
                    second.setContent(0);
                    return;
                }
                second.setContent(second.getContent() - volume);
            }
        }
    }
}
