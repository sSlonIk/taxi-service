package cab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private Long id;
    private String model;
    private cab.model.Manufacturer manufacturer;
    private List<cab.model.Driver> drivers;

    public Car(String model, cab.model.Manufacturer manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        drivers = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public cab.model.Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(cab.model.Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<cab.model.Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<cab.model.Driver> drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Car{"
                + "id=" + id
                + ", model='" + model + '\''
                + ", manufacturer=" + manufacturer
                + ", drivers=" + drivers
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model)
                && Objects.equals(manufacturer, car.manufacturer)
                && Objects.equals(drivers, car.drivers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, manufacturer, drivers);
    }
}
