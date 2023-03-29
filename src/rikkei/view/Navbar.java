package rikkei.view;

import rikkei.config.Config;

public class Navbar {
    int choice = 0;
    public Navbar(){
        do {
            System.out.println("-----Menu------");
            System.out.println("1. hien thi");
            System.out.println("2. them");
            System.out.println("3. sua");
            System.out.println("4. xoa");
            System.out.println("5. thoat");

             choice = Config.sc().nextInt();
             switch (choice){
                 case 1:
                     new ProductView().showListProduct();
                     break;
                 case 2:
                     new ProductView().createProduct();
                     break;
                 case 3:
                     new ProductView().updateProduct();
                     break;
                 case 4:
                     new ProductView().deleteProduct();
                     break;
                 case 5:
                     System.exit(0);
                     break;
             }
        }while (choice!= 5);


    }

    public static void main(String[] args) {
        new Navbar();
    }
}
