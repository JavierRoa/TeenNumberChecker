public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false
        System.out.println(isTeen(9)); // false
        System.out.println(isTeen(13)); // true
    }
    public static boolean hasTeen(int edad1, int edad2, int edad3) {
        return isTeen(edad1) || isTeen(edad2) || isTeen(edad3);
    }
    public static boolean isTeen(int edad) {
        return (edad>=13 && edad<=19);
    }
}
