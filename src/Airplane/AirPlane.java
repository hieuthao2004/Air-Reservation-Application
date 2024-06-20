package Airplane;

public class AirPlane {
    private int id;
    private String name;
    private String manufacturer;
    private String manufacturerDate;
    private PlaneStatus ps;
    
    public AirPlane(int id, String name, String manufacturer, String manufacturerDate, PlaneStatus ps) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturerDate = manufacturerDate;
        this.ps = ps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerDate() {
        return manufacturerDate;
    }

    public void setManufacturerDate(String manufacturerDate) {
        this.manufacturerDate = manufacturerDate;
    }

    public PlaneStatus getPs() {
        return ps;
    }

    public void setPs(PlaneStatus ps) {
        this.ps = ps;
    }
}
