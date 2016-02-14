import java.util.HashMap;

public class Application {
    public static HashMap<String,Math> hashMapOfCommands = new HashMap<>();
       public static void doCommand(String command, Integer num1, Integer num2){
           hashMapOfCommands.put("+", new Add());
           hashMapOfCommands.put("-", new Sub());
           hashMapOfCommands.put("*", new multi());
           
           Math doMath = hashMapOfCommands.get(command);
           
           doMath.execute(num1, num2);
           
       }
}
