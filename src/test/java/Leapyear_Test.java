import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leapyear_Test {

    @Test
    public void dividable_by_4_not_100()
    {
        assertEquals(true, leapyear.isLeapYear(1920));
    }

    @Test
    public void not_dividable_by_4()
    {
        assertEquals(false, leapyear.isLeapYear(1567));
    }

    @Test
    public void dividable_by_100()
    {
        assertEquals(true, leapyear.isLeapYear(2000));
    }
    @Test
    public void not_dividable_by_100()
    {
        assertEquals(false, leapyear.isLeapYear(2200));
    }
}
