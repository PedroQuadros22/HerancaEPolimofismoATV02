import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    public UsedProduct(){}
    public UsedProduct(String name, Double price, LocalDate manufactureDate){
        super(name,price);
        setManufactureDate(manufactureDate);
    }

    public void setManufactureDate(LocalDate manufactureDate){
        if (manufactureDate!=null){
            this.manufactureDate=manufactureDate;
        }
    }
    public LocalDate getManufactureDate(){
        return manufactureDate;
    }

    public String priceTag(){
        return getName()+
                " (used) "
                +"R$ "
                +getPrice()
                +" (Manufacture Date: "
                +manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                +")";
    }
}
