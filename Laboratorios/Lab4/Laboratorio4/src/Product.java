public interface Product {
    String getName();
    Double getPrice();

    public class Electronic implements Product {
        private String name;
        private Double price;
    
        public Electronic(String name, Double price) {
            this.name = name;
            this.price = price;
        }
    
    
        public String getName() {
            return name;
        }
    
    
        public Double getPrice() {
            return price;
        }
    }
}







