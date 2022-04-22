import base_type.point_t;
import base_type.rectangle_t;

public class Rectangle implements Shape{
    private double widht_r;
    private double hight_r;
    point_t pos_r;
    static int rec_count = 0;       //статическая переменная которая считает кол-во фигур

    public Rectangle(double widht_r, double hight_r, point_t pos_r) {
        this.hight_r = hight_r;
        this.pos_r = pos_r;
        this.widht_r = widht_r;
        rec_count++;
    }

    @Override
    public double getArea() {
        return widht_r * hight_r;
    }

    @Override
    public rectangle_t getFrameRect() {
        return new rectangle_t(widht_r, hight_r, pos_r);
    }

    @Override
    public void move(point_t move_point) {
        this.pos_r.x = move_point.x;
        this.pos_r.y = move_point.y;
    }

    @Override
    public void move(double move_x, double move_y) {
        pos_r.y += move_y;
        pos_r.x += move_x;
    }

    @Override
    public void scale(double coeff) {
        if (coeff <= 0) {
            throw new IllegalArgumentException("Wrong argument");
        }
        this.hight_r *= coeff;
        this.widht_r *= coeff;
    }

    public void print() {
        System.out.println("Высота: " + hight_r);
        System.out.println("Ширина: " + widht_r);
        pushData();
    }

    public double getWidht_r() {
        return widht_r;
    }

    public double getHight_r() {
        return hight_r;
    }

    public point_t getPos_r() {
        return pos_r;
    }
}
