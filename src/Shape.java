import base_type.point_t;
import base_type.rectangle_t;

public interface Shape {
    public double getArea();
    public rectangle_t getFrameRect();
    public void move(point_t move_point);
    public void move(double move_x, double move_y);
    public void scale(double coeff);
    public default void pushData() {
        System.out.println("Площадь: " + getArea());
        System.out.println("\tРазмеры описывающего прямоугольника\nВысота:" + getFrameRect().hight);
        System.out.println("Ширина: " + getFrameRect().widht);
        System.out.println("\tПозиция\n X: " + getFrameRect().position.x);
        System.out.println("Y:" + getFrameRect().position.y);
    }
}
