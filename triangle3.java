class Pyramid {

    public static void main(String[] args) {
        int i, n = 9, j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
