package model;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Part {
    private String partName;
    private double partPrice;
    private int id;

    public Part() {
    }

    public Part(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public String getPartName() {
        return partName;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public int getId() {
        return id;
    }
}
