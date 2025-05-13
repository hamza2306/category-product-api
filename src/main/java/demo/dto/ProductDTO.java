package demo.dto;

public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private CategoryDTO category;

    public ProductDTO() {}

    public ProductDTO(Long id, String name, Double price, CategoryDTO category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public Double getPrice() { return price; }
    public CategoryDTO getCategory() { return category; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(Double price) { this.price = price; }
    public void setCategory(CategoryDTO category) { this.category = category; }
}
