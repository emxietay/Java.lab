package vn.funix.fx22541.lab15_3;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Company
        implements Serializable {
    private final long serialVersionUID = 1L;
    private final String name;
    private final String email;
    private final String phone;
    private final String address;
    private final String postcode;
    private final String country;
    private final LocalDate createdDate;

    public Company(String name, String email, String phone, String address, String postcode, String country) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.postcode = postcode;
        this.country = country;
        this.createdDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "Company{" +
                "serialVersionUID=" + serialVersionUID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", country='" + country + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(email, company.email) && Objects.equals(phone, company.phone) && Objects.equals(address, company.address) && Objects.equals(postcode, company.postcode) && Objects.equals(country, company.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, address, postcode, country);
    }
}
