public class Validation {

    public static void rawExpressionValidation(String rawExpression) throws IllegalArgumentException {
        if (rawExpression.equals("")) {
            throw new IllegalArgumentException("Выражение не должно быть пустым");
        }

        if (rawExpression.matches(".+/0|.+/0\\.0")) {
            throw new IllegalArgumentException("На 0 делить нельзя!");
        }

        if (!rawExpression.matches("[[0-9]/*\\-+.^]+")) {
            throw new IllegalArgumentException("Недопустимый символ в выражении");
        }

        if (!rawExpression.matches("^[0-9].+[0-9]$|^[-0-9].+[0-9]$")) {
            throw new IllegalArgumentException("Выражение должно начинаться и заканчиваться цифрой");
        }

        if (rawExpression.split("[-*/+]").length > rawExpression.split("[-*/+]+").length) {
            throw new IllegalArgumentException("Недопустимое количество операторов в выражении");
        }
    }
}
