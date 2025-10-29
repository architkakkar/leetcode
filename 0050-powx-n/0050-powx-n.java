class Solution {
    public double myPow(double x, int n) {
        long N = n; // convert to long

        if (N == 0) return 1.0;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double half = myPow(x, (int)(N / 2));
        return (N % 2 == 0) ? half * half : x * half * half;
    }
}