import entity.MemberOfExpression;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class MathCalculations {

    public String getAnswer(List<MemberOfExpression> expression) {
        Deque<MemberOfExpression> stack = new ArrayDeque<>();

        for (MemberOfExpression currentElement : expression) {
            if (currentElement.getType().equals("operand")) {
                stack.addFirst(currentElement);
                continue;
            }
            MemberOfExpression lastElement = stack.pop();
            MemberOfExpression secondToLastElement = stack.pop();
            stack.addFirst(currentElement.doOperation(secondToLastElement, lastElement));
        }

        return stack.pop().getValue();
    }
}
