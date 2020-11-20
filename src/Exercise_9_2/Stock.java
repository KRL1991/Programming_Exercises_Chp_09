package Exercise_9_2;

public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    public Stock(String symbol) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){

        return (previousClosingPrice-currentPrice) *100;
    }

}
