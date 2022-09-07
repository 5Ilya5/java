class Main {

    public static void main(String[] args) {

        int n = 6;
        int m = n;

        for (int i = 1; i <= n; i++, m--) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}