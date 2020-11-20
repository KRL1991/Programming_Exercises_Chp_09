package Exercise_9_2;

public class Main {

    public static void main(String[] args) {

        Stock stock = new Stock("ORCL");
        stock.name = "Oracle Corporation";
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Stock name: " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.println("Percentage change: " + stock.getChangePercent()+ " %");

    }
}
