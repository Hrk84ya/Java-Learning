interface Drawable {
    void draw();
    default void display() {
        System.out.println("Displaying drawable object");
    }
}

interface Movable {
    void move(int x, int y);
}

class Point implements Drawable, Movable {
    private int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing point at (" + x + ", " + y + ")");
    }
    
    @Override
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println("Point moved to (" + x + ", " + y + ")");
    }
}

class Line implements Drawable {
    private Point start, end;
    
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing line from start to end point");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Point point = new Point(5, 10);
        point.draw();
        point.display();
        point.move(15, 20);
        
        Line line = new Line(new Point(0, 0), new Point(10, 10));
        line.draw();
        line.display();
    }
}