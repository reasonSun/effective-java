package chapter2.item4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityTest {
    @Test
    public void callInstanceTest() {
        //Utility test = new Utility(); //private 생성를 선언했기 때문에 인스턴스화 할 수 없다.
        String name = Utility.name();
        Assertions.assertEquals("util", name);

    }

}