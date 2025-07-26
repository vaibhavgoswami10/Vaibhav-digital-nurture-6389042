package financialForecasting;

class financialForecasting {

    public static double calculateFutureValue(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0;
        double annualGrowthRate = 0.07;
        int years = 5;

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, years);

        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
