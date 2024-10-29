import java.util.Scanner;
public class currency_converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to currency convereter!!!");
        System.out.println("1.USD to Rupee");
        System.out.println("1.Rupee to USD");
        System.out.println("1.Euro to Rupee");
        System.out.println("1.Rupee to Euro");
        System.out.println("Enter your choice(1 or 2 or 3 or 4): ");
        int choice = sc.nextInt();
        
        if (choice==1){
            System.out.println("Enter the amount in the USD");
            double USD = sc.nextDouble();
            double Rupee = usdtoRupee(USD);
            System.out.println("Converterd amount in Rupee:"+Rupee);
        }else if (choice==2){
            System.out.println("Enter the amount in the Rupee");
            double Rupee = sc.nextDouble();
            double USD = Rupeetousd(Rupee);
            System.out.println("Converterd amount in USD:"+USD);

        }else if (choice==3){
            System.out.println("Enter the amount in the EURO");
            double EURO = sc.nextDouble();
            double Rupee = eurotoRupee(EURO);
            System.out.println("Converterd amount in USD:"+Rupee);

    }else if (choice==4){
        System.out.println("Enter the amount in the EURO");
        double Rupee = sc.nextDouble();
        double EURO = Rupeetoeuro(Rupee);
        System.out.println("Converterd amount in USD:"+EURO);

}
    else{
        System.out.println("Invalid choice.Please select 1 or 2 or3 or 4.");
    }
     sc.close();
    }
    public static double usdtoRupee(double USD) {
        return USD*84.07;
    }
    public static double Rupeetousd(double Rupee) {
        return Rupee*0.012;

}
public static double eurotoRupee(double EURO) {
    return EURO*90.65;
}
public static double Rupeetoeuro(double Rupee) {
    return Rupee*90.67;
   
}

}

