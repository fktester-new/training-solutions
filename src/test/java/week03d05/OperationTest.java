package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {

    @Test
    public void operationMainTest(){
        OperationMain operationMain = new OperationMain();
        Operation operation = operationMain.operationTest("123+456");

        int l = operation.getLeft();
        int r = operation.getRight();

        assertEquals(579, operation.getResult(l, r));
    }
}
