package project;

public class Main {
    public static void main(String[] args) {

       Manager manager= new Manager();
      //  manager.setsack("odo");
       //  manager.setemploy("staff1");
      //  System.out.println("...............................");
//manager.setemploy("staff1");

     Cash cash = new Cash();
   cash.setbasicsalary(300);
   cash.setextrahourworked(5);
   cash.setBonus(2);
   System.out.println("..................................................");
    int  wage = cash.Calaculatewage(4 );
        System.out.println( wage);

        System.out.println("..................................................");
          //  Product wire = new Product();
          //  wire.name = "1.5mm";
          //  wire.price = 7000;
           // wire.product = "cutix";


//            bulb.name = "bulb";
           // bulb.price = 700;
         ///
        //bulb.product = "AKT"
            ;
          //  Product thunderarrestor = new Product();
           // thunderarrestor.name = "thunder arrestor";
          //  thunderarrestor.price = 9000;
           // thunderarrestor.product = "china";

            Product products[] = new Product[3];

          //  products[0] = wire;
          //  products[1] = bulb;
          //  products[2] = thunderarrestor;

          //  for (Product pro : products ) {
           //     System.out.println( pro.name + " : " + pro.product + " :  " + pro.price);
            }
        }
  //  }


