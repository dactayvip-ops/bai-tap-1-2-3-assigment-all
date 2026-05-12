public class Main {
    public static void main(String[] args) {

        // Tạo 5 mãng object Circle với bán kính khác nhau
        Circle[] circles = {
                new Circle(5),
                new Circle(10),
                new Circle(3),
                new Circle(7),
                new Circle(12)
        };


                // Tính tổng diện tích
        double tongDienTich = 0;

        for (Circle c : circles) {
            tongDienTich += c.area();
        }

        System.out.println("Tổng diện tích của 5 hình tròn: " + tongDienTich);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}