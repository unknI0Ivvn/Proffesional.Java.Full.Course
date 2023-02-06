package Lesson4.reference;

import org.junit.Test;

public class PrimitiveTypeTest {
    @Test
    public void example()
    {
        int a = 8;
        System.out.println("Before modify:" +a);
        modify(a);
        System.out.println("After mdoify:"  +a);
    }

private static void modify(int a) {
    a += 100;
    System.out.println("Inside mofidy:" + a);
}
}

