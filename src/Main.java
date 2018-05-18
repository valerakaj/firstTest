public class Main {

    public static void main(String[] args) {
        hello("world");

        Square s = new Square(5);

        System.out.println("Площадь квадрата со стороной " + s.l + " - " + area(s));

        Rectangle r = new Rectangle(4,6);



        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

        }

            private static void hello(String somebody) {
            System.out.println("Hello, " + somebody + "!");

            }

            private static double area(Square s) {
                return s.l * s.l;

            }

            private static double area(Rectangle r) {
                return r.a * r.b;

            }


    }
