class NQueen {
    public static boolean isPromising(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]||(q[i] - q[n]) == (n - i)||(q[n] - q[i]) == (n - i))
                return false;   
        }
        return true;
    }

    public int nQueen(int N) {
        int[] a = new int[N];

        return nQueen(a, 0);
    }

    public static int nQueen(int[] q, int n) {
        int N = q.length;
        int sum =0;
        if (n == N) {
            return 1;
        } else {
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (isPromising(q, n)) {
                    sum+=nQueen(q, n + 1);  
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NQueen nq = new NQueen();
        System.out.println(nq.nQueen(3));
    }
}