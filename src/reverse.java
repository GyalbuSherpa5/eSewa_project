public class reverse {

    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 4, 5, 6, 5, 6};
        for (int i = 0; i <= a.length; i++) {
            for (int j = 1; j <= a.length - 1; j++) {
                if (a[i] != a[j]) {
                    System.out.println(i);
                }
            }
        }


    }
}
