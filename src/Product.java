public class Product {
    private String name;
    private Double price;

    public Product(){}
    public Product(String name,Double price){
        setName(name);
        setPrice(price);
    }

    public void setName(String name){
        if(name!=null){
            this.name=name;
        }
    }
    public String getName(){
        return name;
    }

    public void setPrice(Double price){
        if(price>0){
            this.price=price;
        }
    }
    public Double getPrice(){
        return price;
    }

    public String priceTag(){
        return name
                +String.format(" R$ %.2f ",price);
    }


}
