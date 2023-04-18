package extras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.System.out;
import static java.util.Collections.*;

public class ImportsRunner {

    public static void main(String[] args) {

        String str = "";

        BigDecimal bd = null;

        // static import is added
        out.println("Static imports");

//        Collections.sort(new ArrayList<String>());
        sort(new ArrayList<String>());
    }
}
