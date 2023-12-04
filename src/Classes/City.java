package Classes;

public class City {
    private String cityname;
    private String region;
    private String country;
    private int population;
    private int postalCode;
    private String phoneCode;

    public City() {
        this.cityname = "Неизвестно";
        this.region = "Неизвестно";
        this.country = "Неизвестно";
        this.population = 0;
        this.postalCode = 0;
        this.phoneCode = "+380 (5134)";
    }

    public City(String cityname, String region, String country, int population, int postalCode, String phoneCode) {
        this.cityname = cityname;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postalCode = postalCode;
        this.phoneCode = phoneCode;
    }

    //set
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    //get
    public String getCityname() {
        return cityname;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    @Override
    public String toString() {
        return "\nГород" + "\nНазвание города: " + cityname + "\nНазвание региона: " + region +
                "\nНазвание страны: " + country + "\nКоличество жителей: " + population +
                "\nПочтовый индекс города: " + postalCode + "\nТелефонный код города: " + phoneCode;
    }
}