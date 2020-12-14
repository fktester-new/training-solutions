package week03d05;

public class OperationMain {

    public Operation operationTest(String string) {

        int left = Integer.parseInt(string.substring(0, string.indexOf("+")));
        int right = Integer.parseInt(string.substring(string.indexOf("+") + 1));

        Operation operation = new Operation(left, right);
        return operation;
    }
}
