package entity;

import java.math.BigDecimal;

public class Subtraction extends MemberOfExpression {

    public Subtraction() {
        super(1, "-", "operator");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {

        BigDecimal bdOne = new BigDecimal(operandOne.getValue());
        BigDecimal bdTwo = new BigDecimal(operandTwo.getValue());

        return new Operand(bdOne.subtract(bdTwo).toString());
    }
}
