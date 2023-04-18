package extras;

import java.util.Objects;

class Client {
    private int id;

    public Client(int id) {
        super();
        this.id = id;
    }

    @Override // modified to compare equalities based on ids
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Client client = (Client) o;
        if(this.id == client.id) {
            return true;
        } else {
            return false;
        }
    }

    @Override // written along with the equals method
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class EqualsRunner {

    public static void main(String[] args) {

        // two objects are equal only when they are referring to the same object
        Client c1 = new Client(10);
        Client c2 = new Client(10);
        System.out.println(c1.equals(c2));
    }
}
