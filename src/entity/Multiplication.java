package entity;

import java.math.BigDecimal;

public class Multiplication extends MemberOfExpression {

    public Multiplication() {
        super(2, "*", "operator");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {

        BigDecimal bdOne = new BigDecimal(operandOne.getValue());
        BigDecimal bdTwo = new BigDecimal(operandTwo.getValue());

        return new Operand(bdOne.multiply(bdTwo).toString());
    }
}
