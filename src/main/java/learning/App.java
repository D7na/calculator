package learning;
import java.util.*;

public class App {
    public static void main(String... args) {
        Input input = new Input();
        String value1 = input.setInput();
        // String operation = input.setInput();
        String value2 = input.setInput();
        Calc calc = new Calc();
        // Add a condition under which the output will be in Roman or Arabic (getType method)
        // Change result output after adding operation
        System.out.println("The result is:" + calc.add(value1, value2));
    }
}

class Input {
     String setInput() {
         String input;
         input = this.getConsoleInput();
         return input;
    }

    private String getConsoleInput() {
         // Add input with operation
        Scanner consoleIn = new Scanner(System.in);
        System.out.println("Enter expression:");
        String input = consoleIn.nextLine();
        consoleIn.close();
        return input.toUpperCase();
    }
}
