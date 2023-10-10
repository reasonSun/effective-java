package chapter8.item49;

import java.math.BigInteger;
import java.util.Objects;

public class ValChkExample {
    /**
     * (현재 값 mod m) 값을 반환한다. 이 메서드는
     * 항상 음이 아닌 BigInteger를 반환한다는 점에서 remainder 메서드와 다르다.
     * @param m 계수(양수여야 한다)
     * @return 현재 값 mod m
     * @throws ArithmeticException m이 0보다 작거나 같으면 발생한다.
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0) {
            throw new ArithmeticException("계수(m)는 양수여야 합니다. " + m);
        }
        // 계산 수행
        return null; // 편의상 null을 리턴했다.
    }

    private String strategy;

    public void changeStrategy(String strategy) {
        this.strategy = Objects.requireNonNull(strategy, "전략");
    }

    public static void main(String[] args) {
        ValChkExample valChkExample = new ValChkExample();
        valChkExample.changeStrategy(null);

    }
}

