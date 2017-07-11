package model;

/**
 * Created by Pawel Krowicki on 2017-07-04.
 */
public class Part {
    private String partName;
    private double partPrice;
    private Integer id;

    public Part() {
    }

    public Part(String partName, double partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public Part(String partName, double partPrice, Integer id) {
        this.partName = partName;
        this.partPrice = partPrice;
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public double getPartPrice() {
        return partPrice;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Part part = (Part) o;

        if (Double.compare(part.partPrice, partPrice) != 0) return false;
        if (id != part.id) return false;
        return partName != null ? partName.equals(part.partName) : part.partName == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = partName != null ? partName.hashCode() : 0;
        temp = Double.doubleToLongBits(partPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + id;
        return result;
    }
}
