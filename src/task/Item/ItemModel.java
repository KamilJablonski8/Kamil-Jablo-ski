package task.Item;

public class ItemModel {
    private String title;
    private String description;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ItemModel(String title, String description, double price) {
        this.title = title;
        this.description = description;
        this.price = price;


    }

    private String getTitle() {
        return title;
    }

    private String getDescription() {
        return description;
    }

    private double getPrice() {
        return price;
    }
}
