package section3;

public class Product1 {
    private long id;
    private String productName;
    private String supplierName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Product1() {

    }

    public Product1(long id, String productName, String supplierName) {
        super();
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public String toString() {
        return "Product1 [id=" + id + ", productName=" + productName + ", supplierName="
                + supplierName + "]";
    }

}
