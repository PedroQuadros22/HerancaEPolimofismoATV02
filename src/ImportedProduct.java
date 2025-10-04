public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){}
    public ImportedProduct(String name, Double price, Double customsFee){
        super(name,price);
        setCustomsFee(customsFee);
    }

    public void setCustomsFee(Double customsFee){
        if(customsFee>0){
            this.customsFee=customsFee;
        }
    }
    public Double getCustomsFee(){
        return customsFee;
    }

    public Double totalPrice(){
        return getPrice()+customsFee;
    }
    public String priceTag(){
        return getName()
                +String.format(" R$ %.2f ",totalPrice())
                + "(Customs Fee: R$  "
                + String.format("%.2f",customsFee)
                +")";
    }


}
