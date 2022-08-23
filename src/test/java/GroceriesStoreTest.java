public class GroceriesStoreTest {

    public static void main(String[] args) {


        groceriesstore houston = new groceriesstore();
        groceriesstore seattle = new groceriesstore();

          houston.numberapplesoldperofftheyear = 134;
          houston.retailpricteofeachorrange= 0.87;
          houston.numberoforangessoldperyear = 534;
          houston.retailpriceofeachapple = 0.99;
//        System.out.println("apple sold " + houston.numberapplesoldperofftheyear);
//        System.out.println("Apple Retail Price " + houston.retailpriceofeachapple);
//        System.out.println("Orange Sold " +houston.numberoforangessoldperyear );
//        System.out.println( "Orange Retail Price " + houston.retailpricteofeachorrange);

       seattle.numberapplesoldperofftheyear = 842;
       seattle.retailpricteofeachorrange= 0.92;
       seattle.numberoforangessoldperyear =765;
       seattle.retailpriceofeachapple = 0.99;
//
//        System.out.println("apple sold " + seattle.numberapplesoldperofftheyear);
//        System.out.println("Apple Retail Price " + seattle.retailpriceofeachapple);
//        System.out.println("Orange Sold " +seattle.numberoforangessoldperyear );
//        System.out.println( "Orange Retail Price " + seattle.retailpricteofeachorrange);

//houston.grossRevenue("houston");
//seattle.grossRevenue("seattle");

seattle.grossRevenue1("seattle");
    }

}
