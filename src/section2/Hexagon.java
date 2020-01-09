package section2;

public class Hexagon extends Shape {
    int side1;

    public Hexagon(int side) {
        super();
        this.side1 = side;
    }

    public int getSide() {
        return side1;
    }

    public void setSide(int side) {
        this.side1 = side;
    }
}
