public class Main {
    public static void main(String[] args) {
        int myInt = 1;
        double myDouble = 2.123;
        System.out.println(myInt);
        System.out.println(myDouble);
        myInt = (int)myDouble;
        System.out.println(myInt);
    }
}