public class groceriesstore {

    int numberapplesoldperofftheyear;
    double retailpriceofeachapple;
    int numberoforangessoldperyear;
    double retailpricteofeachorrange;


    public void grossRevenue(String city) {
        double revenue = (numberapplesoldperofftheyear * retailpriceofeachapple)
                + (numberoforangessoldperyear * retailpricteofeachorrange);


        System.out.println("the revenue of the " + city + " is =" + revenue);
    }


    public double grossRevenue1(String city1) {
        double revenue = (numberapplesoldperofftheyear * retailpriceofeachapple)
                + (numberoforangessoldperyear * retailpricteofeachorrange);


        System.out.println("the revenue of the " + city1 + " is =" + revenue);
        return revenue;
    }
}