package com.ravi.Enum;

public class Demo1 {
    enum Laptop{
        Macbook(98000),Dell(59000),Hp(65000),ThinkBook(52000),XPS(18000);
        int price;
        private Laptop(int price){
            this.price = price;
        }
        public int getPrice(){
            return price;
        }
        public void setPrice(int price){
            this.price = price;
        }
    }

    public static void main(String[] args) {
//        Laptop lap = Laptop.Macbook;
//        System.out.println(lap+ " : "+lap.getPrice());
        for(Laptop lap : Laptop.values()){
            System.out.println(lap+ " : "+lap.getPrice());
        }
    }
}
