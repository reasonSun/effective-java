package chapter6.item39.markerannotation;

//마커 애너테이션
public class Sample {
    @Test
    public static void m1() { }        // 성공

    public static void m2() { }

    @Test
    public static void m3() {    // 실패
        throw new RuntimeException("실패");
    }

    public static void m4() { }

    @Test
    public void m5() { }   // 잘못 사용한 예: 정적 메서드가 아니다.

    public static void m6() { }

    @Test
    public static void m7() {    // 실패
        throw new RuntimeException("실패");
    }

    public static void m8() { }
}
