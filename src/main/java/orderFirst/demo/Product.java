package orderFirst.demo;



public class Product {

    String db_id;
    private String product_id;
    private String category;
    private String name;
    private int price;
    private String photo;
    private String description;

    public Product() {
    }

    public Product(String db_id, String product_id, String category, String name, int price, String photo, String description) {
        this.db_id = db_id;
        this.product_id = product_id;
        this.category = category;
        this.name = name;
        this.price = price;
        this.photo = photo;
        this.description = description;
    }


    public String getProduct_id() {
        return product_id;
    }

    public String getDb_id() {
        return db_id;
    }

    public void setDb_id(String db_id) {
        this.db_id = db_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", category=" + category + ", name=" + name + ", price=" + price + ", photo=" + photo + ", description=" + description + '}';
    }
}

