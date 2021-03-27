package entity;

public class Operand extends MemberOfExpression {

    public Operand(String value) {
        super(null, value, "operand");
    }

    @Override
    public MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo) {
        return null;
    }
}
