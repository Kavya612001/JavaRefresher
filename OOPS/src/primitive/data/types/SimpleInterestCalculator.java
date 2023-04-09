package primitive.data.types;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

    public BigDecimal principal;
    public BigDecimal interest;

    public SimpleInterestCalculator(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
    }

    public BigDecimal calculateTotalValue(int noOfYears) {
        return principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
    }
}
