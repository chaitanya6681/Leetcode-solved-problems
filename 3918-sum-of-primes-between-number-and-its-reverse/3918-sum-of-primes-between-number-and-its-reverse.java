class Solution {

    public int sumOfPrimesInRange(int n) {

        int n1 = n, rev = 0;

        while (n1 > 0) {
            int r = n1 % 10;
            rev = rev * 10 + r;
            n1 /= 10;
        }

        int t = 0;

        int m = Math.min(n, rev);
        int d = Math.max(n, rev);

        for (int i = m; i <= d; i++) {

            if (i < 2)
                continue;

            boolean prime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                t += i;
            }
        }

        return t;
    }
}