import java.util.Scanner;

public class UserInterface {

  private TodoList todoos;
  private Scanner scanner;

  public UserInterface(TodoList todoos, Scanner scanner){
    this.todoos = todoos;
    this.scanner = scanner;
  }
  
  public void start(){    
    while (true){
      System.out.print("Command: ");
      String command = this.scanner.nextLine();

      switch (command) {
        case "stop":
          return;
        case "add":
          System.out.print("To add: ");
          String task = this.scanner.nextLine();
          this.todoos.add(task);
          break;
        case "list":
          this.todoos.print();
          break;
        case "remove":
          System.out.print("Which one is removed? ");
          int taskToRemove = Integer.valueOf(this.scanner.nextLine());
          this.todoos.remove(taskToRemove);
          break;
        default:
          break;
      }

    }
  }
}
