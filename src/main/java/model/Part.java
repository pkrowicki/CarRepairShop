package model;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Part {
    private final String partName;
    private final double partPrice;
    private int id;

    public Part(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }
}
