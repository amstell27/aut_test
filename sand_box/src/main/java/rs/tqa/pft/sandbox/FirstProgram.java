package rs.tqa.pft.sandbox;

public class FirstProgram {

    public static void main(String[] args) {

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4,6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b+ " = " + r.area());

        
        distance(25,36,49,64);
    }

    public static void distance (double a, double b, double c, double d) {

        double p = Math.pow((a-b),2) + Math.pow((c-d),2);
        double q = Math.sqrt(p);
        System.out.println("Расстояние между точками = " + q);
    }
}