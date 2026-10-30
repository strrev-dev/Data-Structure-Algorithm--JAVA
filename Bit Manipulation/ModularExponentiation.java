public class ModularExponentiation {
    public static long modularPower(long base, long exp, long mod) {
        long ans = 1;

        // Ensure base is within mod bounds initially
        base = base % mod;

        while (exp > 0) {
            // If exp is odd, multiply base with ans and take modulo
            if ((exp & 1) == 1) {
                ans = (ans * base) % mod;
            }

            // Square the base for the next bit position, keeping it under mod
            base = (base * base) % mod;

            // Shift the exponent right by 1
            exp >>= 1;
        }

        return ans;
    }
    public static void main(String[] args){
        long base = 3;
        long exp = 13;
        long mod = 10; // Let's find (3^13) % 10

        long result = modularPower(base, exp, mod);
        System.out.println("3^13 % 10 is: " + result);
        // Output: 3 (since 3^13 = 1594323, and it ends in 3)
    }
}
