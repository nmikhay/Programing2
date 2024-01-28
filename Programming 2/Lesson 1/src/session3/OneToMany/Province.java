package session3.examples.OneToMany;

public class Province {
    private String name;
    private City[] cities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province(String name, City[] cities) {
        this.name = name;
        this.cities = cities;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
}
