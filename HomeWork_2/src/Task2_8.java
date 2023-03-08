public class Task2_8 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                System.out.print("*");
            }
            System.out.println();
            int k = 0;
            while(k <= i) {
                System.out.print(" ");
                k++;
            }
        }

    }
}
