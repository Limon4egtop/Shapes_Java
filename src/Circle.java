import base_type.point_t;
import base_type.rectangle_t;

public class Circle implements Shape{
    private double radius_c;
    point_t pos_c;
    static int cir_count = 0;         //статическая переменная которая считает кол-во фигур

    public Circle (double radius_c, point_t pos_c) {
        if (radius_c <= 0) {
            throw new IllegalArgumentException("Wrong argument");
        }
        this.pos_c = pos_c;
        this.radius_c = radius_c;
        cir_count++;
    }

    @Override
    public double getArea() {
        return radius_c * radius_c * 3.14;
    }

    @Override
    public rectangle_t getFrameRect() {
        return new rectangle_t(radius_c * 2, radius_c * 2, pos_c);
    }

    @Override
    public void move(point_t move_point) {
        this.pos_c.x = move_point.x;
        this.pos_c.y = move_point.y;
    }

    @Override
    public void move(double move_x, double move_y) {
        this.pos_c.y += move_y;
        this.pos_c.x += move_x;
    }

    @Override
    public void scale(double coeff) {
        if (radius_c <= 0) {
            throw new IllegalArgumentException("Wrong argument");
        }
        radius_c *= coeff;
    }

    public void print() {
        System.out.println("Радиус: "+ radius_c);
        pushData();
    }

    public double getRadius_c() {
        return radius_c;
    }

    public point_t getPos_c() {
        return pos_c;
    }
}
