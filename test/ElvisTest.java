import chapter2.item3.Elvis;
import chapter2.item3.Elvis3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElvisTest {

    @Test
    public void singletonTest(){
        Elvis elvis1 = Elvis.INSTANCE;
        Elvis elvis2 = Elvis.INSTANCE;
        String name = Elvis3.INSTANCE.getName();

        assertSame(elvis1, elvis2); // SUCCESS
        Assertions.assertEquals("Elvis", name);
    }
}