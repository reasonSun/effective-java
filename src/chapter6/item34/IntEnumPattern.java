package chapter6.item34;

import java.awt.*;

public class IntEnumPattern {
    public static final int APPLE_FUJI = 0;
    public static final int APPLE_PIPPIN = 1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD = 2;

    public static void main(String[] args) {
        // true값이 나오기 때문에 타입 안전성이 지켜지지 않으며, 표현력도 좋지 않다.
        System.out.println(APPLE_FUJI == ORANGE_NAVEL);
    }
}
