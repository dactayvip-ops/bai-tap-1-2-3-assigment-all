public class Main {
    public static void main(String[] args) {

        // Tạo 3 object Book khác nhau
        Book book1 = new Book("một mình tôi cô đơn", "Bùi Đắc Tây", 200000, true);
        Book book2 = new Book("năm sau vẫn cô đơn", "Bùi Đắc Tây", 120000, true);
        Book book3 = new Book("tốt nghiệp vẫn cô đơn", "Bùi Đắc Tây", 300000, false);

        // In thông tin và áp dụng giảm giá 10%
        book1.printInfo();
        book1.applyDiscount(10);

        System.out.println("----------");

        book2.printInfo();
        book2.applyDiscount(10);

        System.out.println("----------");

        book3.printInfo();
        book3.applyDiscount(10);
    }
}

class Book {
    // Thuộc tính
    private String title;
    private String author;
    private double price;
    private boolean inStock;

    // Constructor
    public Book(String title, String author, double price, boolean inStock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    // In toàn bộ thông tin sách
    public void printInfo() {
        System.out.println(" Tên sách : " + title);
        System.out.println("  Tác giả  : " + author);
        System.out.println(" Giá      : " + String.format("%.0f", price) + " VNĐ");
        System.out.println(" Còn hàng : " + (inStock ? "Có" : "Hết hàng"));
    }

    // Giảm giá theo phần trăm
    public void applyDiscount(double percent) {
        double discount = price * percent / 100;
        price = price - discount;
        System.out.println("🏷  Giảm " + percent + "% → Giá mới: "
                + String.format("%.0f", price) + " VNĐ");
    }
}