package Ex2;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea(){
        int area = base * height;
        System.out.println(area);
        return area;
    }
}
