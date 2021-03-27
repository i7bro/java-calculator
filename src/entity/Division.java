package entity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Division extends MemberOfExpression {

    public Division() {
        super(2, "/", "operator");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {

        BigDecimal bdOne = new BigDecimal(operandOne.getValue());
        BigDecimal bdTwo = new BigDecimal(operandTwo.getValue());

        return new Operand(bdOne.divide(bdTwo, 15, RoundingMode.HALF_EVEN).stripTrailingZeros().toPlainString());
    }
}
