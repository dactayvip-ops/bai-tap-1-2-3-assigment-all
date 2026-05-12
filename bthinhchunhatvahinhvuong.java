public class Main {
    public static void main(String[] args) {

        // Tạo 2 object cho 2 hình hình vuông và hình chữ nhật
        Rectangle r1 = new Rectangle(8, 7);   // hình chữ nhật
        Rectangle r2 = new Rectangle(6, 6);   // hình vuông

        // hình chữ nhật tạo object
        System.out.println("===== HÌNH CHỮ NHẬT =====");
        System.out.println("Chiều rộng : " + r1.getWidth());
        System.out.println("Chiều cao  : " + r1.getHeight());
        System.out.println("Diện tích  : " + r1.area());
        System.out.println("Chu vi     : " + r1.perimeter());
        System.out.println("Hình vuông : " + (r1.isSquare() ? "Có" : "Không"));

        System.out.println("----------");

        // tạo object cho hình vuông
        System.out.println("===== HÌNH VUÔNG =====");
        System.out.println("Chiều rộng : " + r2.getWidth());
        System.out.println("Chiều cao  : " + r2.getHeight());
        System.out.println("Diện tích  : " + r2.area());
        System.out.println("Chu vi     : " + r2.perimeter());
        System.out.println("Hình vuông : " + (r2.isSquare() ? "Có" : "Không"));
    }
}

class Rectangle {
    // Thuộc tính method
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // giá trị
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // in diện tích
    public double area() {
        return width * height;
    }

    // in chu vi
    public double perimeter() {
        return 2 * (width + height);
    }

    // có phải hình vuông hay chưa qua boolean
    public boolean isSquare() {
        return width == height;
    }
}