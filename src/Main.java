public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape line = new Line();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();
        Shape diamond = new Diamond();

        System.out.println(circle.getName());
        System.out.println(line.getName());
        System.out.println(rectangle.getName());
        System.out.println(triangle.getName());
        System.out.println(diamond.getName());
    }
}