package chapter6.item34;

public class EnumEx {
    public enum Apple { FUJI, PIPPIN, GRANNY_SMITH}
    public enum Orange {NAVEL, TEMPLE, BLOOD}

    public enum Planet {
        MERCURY(3.302e+23, 2.439e6),
        VENUS(4.869e+24, 6.052e6),
        EARTH(5.975e+24, 6.378e6);

        private final double mass;          // 질량
        private final double raduis;        // 반지름
        private final double surfaceGravity; // 표면중력

        private static final double G = 6.67300E-11;


        Planet(double mass, double raduis) {
            this.mass = mass;
            this.raduis = raduis;
            this.surfaceGravity = G * mass / (raduis * raduis);
        }

        public double mass() {
            return mass;
        }

        public double radius() {
            return raduis;
        }

        public double surfaceGravity() {
            return surfaceGravity;
        }

        public double surfaceWeight(double mass) {
            return mass * surfaceGravity; // F = ma
        }
    }

    public static void main(String[] args) {
        Apple fuji = Apple.FUJI;
        System.out.println(fuji);

        double earthWeight = Double.parseDouble("185");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values()) { //자신 안에 정의된 상수들의 값을 배열에 담아 반환하는 정적 메서드
            System.out.printf("%s에서의 무게는 %f이다.%n", p, p.surfaceWeight(mass) );
        }
    }
}
