package chapter4.item17;

import java.math.BigInteger;
import java.util.BitSet;

public class ImmutableEx {
    public static void main(String[] args) {
        BigInteger moby = new BigInteger("1111");
        System.out.println(System.identityHashCode(moby));
        moby = moby.flipBit(0);
        System.out.println(System.identityHashCode(moby));

        BitSet moby2 = new BitSet(1111);
        System.out.println(System.identityHashCode(moby2));
        moby2.flip(0);
        System.out.println(System.identityHashCode(moby2));
    }
}
