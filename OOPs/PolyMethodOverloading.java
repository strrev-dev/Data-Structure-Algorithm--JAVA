public class PolyMethodOverloading {
    public static void main(String[] args) {
        Calculators calc = new Calculators();
        System.out.println("Starting calculator");
        System.out.println(calc.sum(1, 3));
        System.out.println(calc.sum((float) 1.4, (float) 3.5));
        System.out.println(calc.sum(1, 3, 5));
    }
}

class Calculators {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
