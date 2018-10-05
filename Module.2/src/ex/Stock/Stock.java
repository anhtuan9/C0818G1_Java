package ex.Stock;

public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return previousClosingPrice / currentPrice;
    }

    public String display() {
        return "symbol-" + symbol + "; name-" + name + "; previousClosingPrice-" + previousClosingPrice + "; currentPrice-" + currentPrice;
    }

}
