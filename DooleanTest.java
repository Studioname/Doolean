package Doolean;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DooleanTest {

    @org.junit.jupiter.api.Test
    void testConstructor() {
        Doolean d = new Doolean(true, false);
        assertEquals(true, d.getFirstBool());
        assertEquals(false, d.getSecondBool());

    }

    @org.junit.jupiter.api.Test
    void testGetValue() {
        Doolean d = new Doolean(true, false);
        assertEquals(true, d.getValue());
    }

    @org.junit.jupiter.api.Test
    void testSecondGetValue() {
        Doolean d = new Doolean(false, false);
        assertEquals(false, d.getValue());
    }

    @org.junit.jupiter.api.Test
    void testGetFlipped() {
        Doolean d = new Doolean(true, false);
        assertEquals(false, d.getFlipped());
        d.setFirstBool(false);
        assertEquals(true, d.getFlipped());
    }


}