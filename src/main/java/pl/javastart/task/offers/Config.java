package pl.javastart.task.offers;

public class Config {

    private int minRequiredEarnings = 2000;
    private double percentage = 0.03;

    Config() {

    }

    public int getMinRequiredEarnings() {
        return minRequiredEarnings;
    }

    void setMinRequiredEarnings(int minRequiredEarnings) {
        this.minRequiredEarnings = minRequiredEarnings;
    }

    public double getPercentage() {
        return percentage;
    }

    void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
