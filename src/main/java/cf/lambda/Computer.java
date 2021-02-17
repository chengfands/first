package cf.lambda;

/**
 * @author chengfan
 * @date 2019-12-02 17:29:39
 */
public class Computer {

    private String name;
    private String color;
    private String country;
    private Integer price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Computer() {
    }

    public Computer(String name, String color, String country, Integer price) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.price = price;
    }
}
