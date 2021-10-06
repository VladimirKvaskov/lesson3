package Lesson4TriangleArea;

public  class AreaTriangle {

    public static double mathArea(double a, double b, double c) throws SideTriangleException {
        double p;
        double q;
        double s = 0;
        if (a > 0 & b > 0 & c > 0 & ((a > b & a > c & (b + c) > a)
                || (b > a & b > c & (a + c) > b) || (c > a & c > b & (a + b) > c) || (a == b)& (b==c))) {
            p = (a + b + c) / 2;
            q = p * (p - a) * (p - b) * (p - c);
            s = Math.sqrt(q);
            System.out.println("Площадь треугольника = " + s);
        } else { throw new SideTriangleException("Такого треугольника быть не может");

        }
        return s;
    }
}

