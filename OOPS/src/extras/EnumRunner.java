package extras;

import java.util.Arrays;

public class EnumRunner {

    public static void main(String[] args) {

        Season season = Season.SPRING;

        Season season1 = Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(season1.name());
        // dont store the enum
        System.out.println(season1.ordinal());

        System.out.println(Arrays.toString(season.values()));

        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.getValue());

    }
}
