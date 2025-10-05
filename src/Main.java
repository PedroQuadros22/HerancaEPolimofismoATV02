import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<Product>list=new ArrayList<>();
        System.out.print("Enter the number of products: ");
        int numberOfProducts= sc.nextInt();
        for (int i=1;i<=numberOfProducts;i++){
            System.out.println("Product #"+i+" data:");
            System.out.print("Common, used or imported? (c,u,i):");
            char productType=sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Price: ");
            Double price=sc.nextDouble();
            if(productType=='c'){
                list.add(new Product(name,price));
            } if (productType=='i') {
                System.out.print("Customs fee: ");
                Double customsFee= sc.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            } if (productType=='u') {
                System.out.print("manufacture Date (dd/MM/yyyy): ");
                LocalDate date= LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,date));
            }
        }

        System.out.println("\nPRICE TAGS: ");
        for (Product product: list){
            System.out.println(product.priceTag());
        }
        sc.close();
    }
}