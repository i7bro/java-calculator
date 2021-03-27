package entity;

public abstract class MemberOfExpression {

    private Integer priority;
    private String value;
    private String type;

    public MemberOfExpression(Integer priority, String value, String type) {
        this.priority = priority;
        this.value = value;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MemberOfExpression{" +
                "priority=" + priority +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public abstract MemberOfExpression doOperation(MemberOfExpression operandOne, MemberOfExpression operandTwo);
}
