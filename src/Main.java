//https://media.discordapp.net/attachments/704012117053014048/843869325089964032/unknown.png

import base_type.point_t;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0, new point_t(7.0, 8.0));
        Circle circle = new Circle(10.0, new point_t(2.5, 8.0));
        Circle circle1 = new Circle(80.0, new point_t(2.5, 8.0));
        try {
            rectangle.print();
            rectangle.scale(2);
            rectangle.print();
            rectangle.getFrameRect();
            circle.print();
            circle.move(5, 5);
            circle.print();
            circle.getArea();
        } catch (IllegalArgumentException i) {
            System.out.println(i.getMessage());
        }
    }
}
