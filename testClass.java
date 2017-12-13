/**
 * Object Orientated Principles
 *
 * Project
 *
 * Name:       Steve Walsh
 * Student No: R00151053
 * Date      : 5/12/17
 *
 *
 * test class to check that the object classes are functioning as expected
 *
 */


public class testClass {


    private final static String MENUTITLE = "--------------------------------------- \n" +
                                            "|                                     | \n" +
                                            "|   OOP Final Project: R00151053      | \n" +
                                            "|                                     | \n" +
                                            "|            TEST Class               | \n" +
                                            "|                                     | \n" +
                                            "--------------------------------------- \n\n";


    public static void main(String[] args) {

        // create new product databse
        ProductDB productDB = new ProductDB();


        // print heading
        System.out.println(MENUTITLE);

        testHeading("Test Customer Class");
        Customer firstCustomer = testCustomer();

        testHeading("Test Phone Class");
        Product firstPhone =  testPhone();

        testHeading("Test TV Class");
        testTV();

        testHeading("Test Product DB Class");
        ProductDB.productDB.get(0).print();


        testHeading("Test ProductDB printAll");
        ProductDB.printAll();


        testHeading("Test Order Class");
        testOrder(firstPhone, firstCustomer);



    }

    private static Customer testCustomer() {

        System.out.println("**   Testing default constructor with set methods **\n");
        Customer newCustomer1 = new Customer();

        // test the setName
        newCustomer1.setName("John Smith");

        // test the setAddress
        newCustomer1.setAddress("1 cork street");

        // test the getName
        String name = newCustomer1.getName();

        System.out.println("NewCustomer1 name    = " + name);

        // test the GetAddress
        String address = newCustomer1.getAddress();

        System.out.println("NewCustomer1 address = " + address);
        System.out.println("");

        System.out.println("**   Testing overloaded constructor  and get methods **\n");
        Customer newCustomer2 = new Customer("Alice Cashman", "2 Midleton street");

        // test the getName
        String name2 = newCustomer2.getName();

        System.out.println("NewCustomer2 name    = " + name2);

        // test the GetAddress
        String address2 = newCustomer2.getAddress();

        System.out.println("NewCustomer2 address = " + address2);
        System.out.println("");

        return newCustomer1;
    }

    private static Product testPhone() {

          /*
            test default constructor

           */

        System.out.println("**   Testing default constructor with set methods **\n");

        Phone firstPhone = new Phone();



        // test the setMake method
        firstPhone.setMake("Samsung");

        // test the setModel method
        firstPhone.setModel("S5");

        // test the setStorage method
        firstPhone.setStorage(32);

        // test the setPrice method
        firstPhone.setPrice(849.95);

        // test print method
        firstPhone.print();


        // space to make easier to read
        System.out.println("");


        // add to product Database
       ProductDB.addProduct(firstPhone);


        // space to make easier to read
        System.out.println("");

        /*

        test overloaded constructor

         */
        System.out.println("**   Testing overloaded constructor and print method **\n");

        Phone secondPhone = new Phone("Apple" , "iPhone", 999, "Apple", "iPhone X", 128);

        secondPhone.print();

        // space to make easier to read
        System.out.println("");


        // add to product database
        ProductDB.addProduct(secondPhone);

        return firstPhone;
    }

    private static void testTV() {

         /*
            test default constructor

           */
        System.out.println("**   Testing default constructor with set methods  **\n");

        TV firstTV = new TV();

        // test the setMake method
        firstTV.setMake("LG");

        // test the setModel method
        firstTV.setType(1);

        // test the super setPrice method
        firstTV.setPrice(1499.00);


        // test the setStorage method
        firstTV.setScreenSize(50);

        // test the set3DCapability method
        firstTV.set3DCapability(true);

        // test print method
        firstTV.print();


        // space to make easier to read
        System.out.println("");


        // add to product Database
        ProductDB.addProduct(firstTV);


          /*

        test overloaded constructor

         */
        System.out.println("**   Testing overloaded constructor and print method **\n");

        TV secondTV = new TV( 749.99, "Sony", " Plasma", 60, true);

        secondTV.print();



        // space to make easier to read
        System.out.println("");


        // add to product database
        ProductDB.addProduct(secondTV);


    }
    public static void testOrder(Product product, Customer customer) {

        // create new and first order called firstOrder
        Order firstOrder = new Order();

        // add the phone product to order , set qty to 3
        firstOrder.addOrder(product, 3);

        // add the order to the customer
        customer.addOrder(firstOrder);

        // add the phone product to order , set qty to 8
        firstOrder.addOrder(product, 8);

        // add the second order to the customer
        customer.addOrder(firstOrder);

        // view all orders for the customer
        customer.viewAll();


    }


    /**
     * testHeading
     *
     * Creates heading for testing to make easier to read
     *
     * @param text - name of what is being tested beneath it
     */
    private static void testHeading(String text) {

        System.out.println( "--------------------------------------- \n" +
                            "|                                     | \n" );

        System.out.println( "         " + text + "         " );
        System.out.println( "|                                     | \n" +
                            "---------------------------------------\n" );

    }


}
