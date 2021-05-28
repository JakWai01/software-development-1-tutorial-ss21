package org.example;

public class Rectangle {
    int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof  Rectangle) {
            return width == ((Rectangle) o).width
                    && height == ((Rectangle) o).height;
        } else {
            return false;
        }
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof  Rectangle) {
//            return this.hashCode() == o.hashCode();
//        } else {
//            return false;
//        }
//    }

    @Override public int hashCode() {
        return width + height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 2);
        Rectangle r2 = new Rectangle(1, 2);

        if (r1.equals(r2)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are not the same");
        }
    }
}