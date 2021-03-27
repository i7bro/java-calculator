package entity;

import java.math.BigDecimal;

public class Pow extends MemberOfExpression {

    public Pow() {
        super(3, "^", "operation");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {

        BigDecimal bdOne = new BigDecimal(operandOne.getValue());
        BigDecimal bdTwo = new BigDecimal(operandTwo.getValue());

        return new Operand(bdOne.pow(bdTwo.intValue()).toString());
    }
}
