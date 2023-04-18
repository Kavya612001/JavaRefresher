package extras;

enum Season {
    WINTER(1), SPRING(2), SUMMER(3), FALL(4); // 0,1,2,3


    private int value;

    // added this so that enum contains the values
    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
