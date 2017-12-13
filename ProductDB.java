import java.util.ArrayList;

/**
 * Object Orientated Principles
 *
 * Project
 *
 * Name:       Steve Walsh
 * Student No: R00151053
 * Date      : 5/12/17
 */


public class ProductDB {




    //----------------------------//
    //      Attributes            //
    //----------------------------//

    static ArrayList<Product> productDB ;

    // store number of items in the product Database
    static int numItems= 0;





    //----------------------------//
    //      Methods               //
    //----------------------------//

    /**
     * Constructor
     */
    public  ProductDB () {
        // create array List of products
       productDB = new ArrayList<>();



    }

    /**
     * add a product
     *
     * a product to the productDB list
     *
     */
    public static void addProduct(Product p) {
        productDB.add(p);

        // increase number of items 
        numItems++;

    }

    /**
     * remove a product
     *
     * remove a product from the productDB list
     *
     */
    public void removeProduct(Product p) {
        productDB.remove(p);

        // decrease number of items 
        numItems--;

    }

    /**
     * findProduct
     *
     *
     * searches and prints products details to user
     *
     *
     */
    public void findProduct(int productID) {

        for(int i=0; i< productDB.size(); i++){

            // Scenario 1: locates product
            if( productDB.get(i).getProductID() == productID){

                // prints details of product
                productDB.get(i).print();


            // Scenario 2: Cannot locate product
            }else
                System.out.println("Cannot find Product");
        }
    }

    /**
     * returnProduct
     *
     *
     * searches and returns products details to user
     *
     *
     */

    public static Product returnProduct(int productID) {

        Product product = null;

        for(int i=0; i< productDB.size(); i++){

            // Scenario 1: locates product
            if( productDB.get(i).getProductID() == productID){

                product = productDB.get(i);
            // Scenario 2: Cannot locate product
            } else
                System.out.println("Cannot find Product");
        }

        return product;
    }



    /**
     *
     * PrintAll
     *
     * Prints all products in the productDB list
     *
     * if object is a TV then casts to TV and calls its print method
     * if object is a Phone then casts to Phone and calls its print method
     *
     *
     */
    public static void printAll() {
        Product resProduct;
        Phone resPhone;
        TV resTV;

        for (int i = 0; i < productDB.size(); i++) {

            if (productDB.get(i) != null) {
                resProduct = productDB.get(i);



                // Scenario 1 : Product is of type Phone
                if(resProduct instanceof Phone) {

                    // casts type to Phone
                    resPhone = (Phone) resProduct;//Use the print methods from the products class

                    // prints details
                    resPhone.print();

                    System.out.println("\n");
                }

                // Scenario 1 : Product is of type TV
                else if(resProduct instanceof TV) {

                    // casts type to TV
                    resTV = (TV) resProduct;

                    // prints details
                    resTV.print();

                    System.out.println("\n");

                }
            }
        }
    }
}
