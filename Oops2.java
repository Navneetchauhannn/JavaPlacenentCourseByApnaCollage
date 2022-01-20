
//inheritence
class Shape {
    String color;
}

class Triangle extends Shape {
    public void area(int l, int b) {
        System.out.println(1/2*l*b);
    }
}

class EquiLetaralTriangle extends Triangle {
    public void area(int l, int b) {
        System.out.println(1/2*l*b);
    }
}

class Circle extends Shape {
    public void area(int l, int b) {
        System.out.println(1/2*l*b);
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "white";
        EquiLetaralTriangle e1 = new EquiLetaralTriangle();
        e1.area(2, 4);
    }
}
