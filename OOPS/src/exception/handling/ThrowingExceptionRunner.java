package exception.handling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    // throws Exception needs to be added for all the checked exceptions
    public void add(Amount other) throws CurrenciesDoNotMatchException {
        if(this.currency.equals(other.currency)) {
            this.amount += other.amount;
        } else {
            // throw new Exception("Currencies dont match " + this.currency +" - "+ other.currency);
            throw new CurrenciesDoNotMatchException("Currencies dont match " + this.currency +" - "+ other.currency);
        }
    }

    public String toString() {
        return currency+" "+ amount;
    }
}

class CurrenciesDoNotMatchException extends Exception {

    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}

public class ThrowingExceptionRunner {

    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount a1 = new Amount("USD", 10);
        Amount a2 = new Amount("INR", 20);
        a1.add(a2);
        System.out.println(a1);
    }
}
