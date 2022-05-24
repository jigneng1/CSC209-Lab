public class ToiletPaper {
    private String brand;
    private Double price;
    private int length;
    private String color;
    public ToiletPaper next;

    public ToiletPaper(String brand, Double price, int length, String color,ToiletPaper n) {
        this.brand = brand;
        this.price = price;
        this.length = length;
        this.color = color;
        next = n;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
