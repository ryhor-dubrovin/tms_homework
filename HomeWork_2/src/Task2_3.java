//Вычислить: 1+2+4+8+…+256
public class Task2_3 {
    public static void main(String[] args) {

        int answer = 0;
        int i = 1;

        while (i < 257) {
            answer += i;
            i *= 2;
        }

        System.out.println(answer);
    }
}
