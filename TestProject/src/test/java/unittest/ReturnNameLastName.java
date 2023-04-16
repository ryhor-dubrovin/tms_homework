package unittest;

public class ReturnNameLastName {

    public String returner(int num) {

        boolean isDivisibleByThree = num % 3 == 0;
        boolean isDivisibleByFive = num % 5 == 0;

        if (isDivisibleByThree && isDivisibleByFive) {
            return "Ryhor Dubrovin";
        } else if (isDivisibleByThree) {
            return "Ryhor";
        } else if (isDivisibleByFive) {
            return  "Dubrovin";
        } else {
            return "Error";
        }
    }
}
