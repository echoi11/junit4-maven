import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2 {
    @Test
    public void add_10_4_equals_14() throws InterruptedException {
        Calculator c = new Calculator();
        assertEquals(c.add(10, 4), 14);
        System.out.println("10+4=14"); // where will this output appear?
    }
}