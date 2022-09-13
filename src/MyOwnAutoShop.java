/*
Create MyOwnAutoShop class which contains the main() method. Perform the following within the main()
method.
◦Create an instance of Sedan class and initialize all the fields with appropriate values. Use super(...)
method in the constructor for initializing the fields of the superclass.
◦Create two instances of the Ford class and initialize all the fields with appropriate values. Use super(...)
method in the constructor for initializing the fields of the super class.
◦Create an instance of Car class and initialize all the fields with appropriate values.
Display the sale prices of all instance
 */
public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan mySedan = new Sedan(260, 20000, "Red", 10);
        Ford myFord1 = new Ford (200,18000,"Blue",2010, 10);
        Ford myFord2 = new Ford (180,15000,"Orange",2015, 5);
        Car myCar = new Car (220, 30000, "Black");

        System.out.println("MySedan Price: " + mySedan.getSalePrice());
        System.out.println("MyFord1 Price: " + myFord1.getSalePrice());
        System.out.printf("MyFord2 Price: " +  myFord2.getSalePrice());
        System.out.printf("MyCar Price: " + myCar.getSalePrice());
    }

}
