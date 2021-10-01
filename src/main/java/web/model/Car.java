package web.model;

public class Car {

    private String model;
    private String colour;
    private int series;

    public Car() {
    }

    public Car(String model, String colour, int series) {
        this.model = model;
        this.colour = colour;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
