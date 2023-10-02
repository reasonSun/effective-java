package chapter4.Item20;

public interface Singer {
    void sing();
    void dance();


    /**
     * @implSpec
     * test 출력
     */
    default String printSing() {
        return "test";
    }
//    default String toString() { // 컴파일에러
//    }
}
