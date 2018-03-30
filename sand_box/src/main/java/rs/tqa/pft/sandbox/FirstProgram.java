package rs.tqa.pft.sandbox;

public class FirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");

        double i = 5;
        double j = 6;
        System.out.println("Площадь квадрата со стороной " + i + " = " + area(i));
        System.out.println("Площадь прямоугольника со сторонами " + i + " и " + j+ " = " + area(i,j));
    }

    public static void hello (String somebody) {

        System.out.println("Hello," + somebody + "!");
    }

    public static double area (double l) {
        return l*l;
    }

    public static double area(double a, double b){
        return a*b;
    }

}