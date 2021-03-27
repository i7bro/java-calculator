package entity;

import java.math.BigDecimal;

public class Addition extends MemberOfExpression {

    public Addition () {
        super(1, "+", "operator");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {

        BigDecimal bdOne = new BigDecimal(operandOne.getValue());
        BigDecimal bdTwo = new BigDecimal(operandTwo.getValue());

        return new Operand(bdOne.add(bdTwo).toString());
    }
}
