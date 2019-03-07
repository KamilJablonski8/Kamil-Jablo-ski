package task.Item;

public class ItemManager {
    ItemModel createShopItem(String title, String description, double price) {
        return new ItemModel(title, description, price);
    }
}
