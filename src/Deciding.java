public class Deciding {

    public static void decide() {
        ConsoleRW consoleRW = new ConsoleRW();
        ParsingStringToExpression parsing = new ParsingStringToExpression();
        MathCalculations math = new MathCalculations();

        String target = consoleRW.read();
        String answer = math.getAnswer(parsing.consoleStringToPRN(target));
        consoleRW.write(answer);
    }
}
