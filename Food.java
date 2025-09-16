import java.util.*;
class Food{
public static void main(String[] args){
    System.out.println("Welcome to food order system");
    System.out.println("1.pizza-150 rs");
    System.out.println("2.burger-80 rs");
    System.out.println("3.sandwich-60 rs");
    System.out.println("4.coffe-50 rs");
     
     Scanner sc=new Scanner(System.in);
     System.out.println("enter how many items you want to order");
     int n=sc.nextInt();
     double totalprice=0;
     double totalitems=0;
     double price=0;
     

     for(int i=0;i<n;i++){
        System.out.println("enter the option(1-4):");
        int option=sc.nextInt();
        switch(option){
            case 1:
                price=150;
                break;
            case 2:
                price=80;
                break;
            case 3:
                price=60;
                break;
            case 4:
                price=50;
                break;
            default:
                System.out.println("Invalid option");
        }
        System.out.println("Enter the quantity");
        int quantity=sc.nextInt();
         while(quantity<=0){
            System.out.println("Enter the quantity");
         }
        totalitems=price*quantity;
        totalprice +=totalitems;



     }
     System.out.println("Total bill:"+totalprice);
     if(totalprice>500){
       totalprice -=totalprice*0.1;
       System.out.println("Discount:"+totalprice*0.1);
       System.out.println("Payable amount:"+totalprice);

     }
     else if((totalprice>300) && (totalprice<500)){
       totalprice -=totalprice*0.05;
       System.out.println("Discount:"+totalprice*0.05);
       System.out.println("Payable amount:"+totalprice);

     }
     else{
        System.out.println("Discount:0 rs");
     }
     System.out.println("Thank you for ordering....");
}
}