import java.math.BigDecimal;
import java.util.Scanner;

public class ConsoleRW {

    private String rawExpression;

    public String read() {

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите выражение: ");
                rawExpression = scanner.nextLine();
                Validation.rawExpressionValidation(rawExpression);
                System.out.println("\nПроизводится вычисление...");
                break;
            } catch (Exception e) {
                System.out.println("ВНИМАНИЕ! " + e.getMessage() + "!");
            }
        }
        return rawExpression;
    }

    public void write(String value) {
        System.out.println("\n" + rawExpression + " = " + value);
    }

}
