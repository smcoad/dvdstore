import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Application aC = new Application();
        String add = "add";
        String sub = "sub";
        String multi = "multi";
        Integer num1 = 0;
        Integer num2 = 0;
        String command;
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        num1 = Integer.parseInt(in.nextLine());
        System.out.println("+ or -");
        command = in.nextLine();
        System.out.println("Enter a number: ");
        num2 = Integer.parseInt(in.nextLine());
        
        System.out.print(num1+" " + command +" "+num2 +" = ");
        aC.doCommand(command,num1,num2);
        
        
    }
}
