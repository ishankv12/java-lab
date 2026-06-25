class Q10 {
    static void m3() {
        int x = 10 / 0; // exception here
    }

    static void m2() {
        m3();
    }

    static void m1() {
        try {
            m2();
        } catch (ArithmeticException e) {
            System.out.println("Handled in m1: " + e);
        }
    }

    public static void main(String[] args) {
        m1();
    }
}