//package bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void test() {
        Cal c=new Cal();
        int res=c.add(2,2);
        assertEquals(4,res);
    }
}
