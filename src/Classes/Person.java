package Classes;

public class Person {
    private String fullname;
    private String dateOfBirth;
    private String phoneNumber;
    private String city;
    private String country;
    private String homeAddress;

    public Person() {
        this.fullname = "Неизвестно";
        this.dateOfBirth = "Неизвестно";
        this.phoneNumber = "Неизвестно";
        this.city = "Неизвестно";
        this.country = "Неизвестно";
        this.homeAddress = "Неизвестно";
    }

    public Person(String fullname, String dateOfBirth, String phoneNumber, String city, String country, String homeAddress) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    //set
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    //get
    public String getFullname() {
        return fullname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }
 
    @Override
    public String toString() {
        return "\nЧеловек" + "\nФИО: " + fullname + "\nДата рождения: " + dateOfBirth +
                "\nНомер телефона: " + phoneNumber + "\nГород: " + city +
                "\nСтрана: " + country + "\nдомашний адрес: " + homeAddress;
    }
}