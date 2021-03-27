import entity.*;

import java.util.*;

public class ParsingStringToExpression {

    public List<MemberOfExpression> consoleStringToPRN (String rawExpression) {
        return parsToPRN(parsToList(rawExpression));
    }

    public List<MemberOfExpression> parsToList(String rawExpression) {
        String[] operands = rawExpression.split("[/*\\-+^]");
        String[] operators = Arrays.stream(rawExpression.split(""))
                .filter(s -> s.matches("[/*\\-+^]"))
                .toArray(String[]::new);

        List<MemberOfExpression> members = new ArrayList<>(operands.length + operators.length);

        for (int i = 0; i < operands.length; i++) {

            members.add(new Operand(operands[i]));

            if (i > operators.length - 1) {
                break;
            }

            String strOperator = operators[i];
            if (strOperator.equals("/")) {
                members.add(new Division());
            }
            if (strOperator.equals("*")) {
                members.add(new Multiplication());
            }
            if (strOperator.matches("-")) {
                members.add(new Subtraction());
            }
            if (strOperator.matches("\\+")) {
                members.add(new Addition());
            }
            if (strOperator.matches("\\^")) {
                members.add(new Pow());
            }
        }
        return members;
    }

    public List<MemberOfExpression> parsToPRN(List<MemberOfExpression> expressionList) {
        List<MemberOfExpression> PRNExpression = new ArrayList<>(expressionList.size());
        Deque<MemberOfExpression> stack = new ArrayDeque<>();

        for (MemberOfExpression currentElement : expressionList) {
            if (currentElement.getType().equals("operand")) {
                PRNExpression.add(currentElement);
                continue;
            }
            if (stack.isEmpty()) {
                stack.add(currentElement);
            } else if (currentElement.getPriority() > stack.peek().getPriority()) {
                stack.addFirst(currentElement);
            } else {
                while (!stack.isEmpty()) {
                    PRNExpression.add(stack.pop());
                }
                stack.add(currentElement);
            }
        }
        while (!stack.isEmpty()) {
            PRNExpression.add(stack.pop());
        }
        return PRNExpression;
    }
}
