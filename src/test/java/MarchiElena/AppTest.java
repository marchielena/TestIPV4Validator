package MarchiElena;

import org.junit.Test;
import static org.junit.Assert.*;


public class AppTest {

    @Test
    public void Test1() {
        assertEquals(true, App.Ipv4Validator("127.0.0.1"));
    }

    @Test
    public void Test2() {
        assertEquals(false, App.Ipv4Validator("123.456.789.0"));
    }
}
