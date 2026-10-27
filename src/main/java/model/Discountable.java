package model;

public interface Discountable {
    default double getDiscount() {
        return 0;
    }
}
// ready