package ma.ac.emi.bricool.entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

<<<<<<< HEAD
@DiscriminatorValue("seller")

public class Seller extends AppUser{


=======

public class Seller{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sellerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private Date yearsOfBirth;
    private String gender;
>>>>>>> a7f79a405de6835635705c37bd007ba4ab218260
    private String cin;
    private String businessHours;
    private String operationalRegion;
    private String city;
    private String slogan;
    private String description;
    private Double rating;
    private Integer completedTaskNumber;
    private String photoDeProfil;
    private Integer yearsOfExperience;

    @ElementCollection
    private List<String> occupations= new ArrayList<>();

    @OneToMany
    private List<Project> projects;

<<<<<<< HEAD
    private String role= UserRole.SELLER;
=======


>>>>>>> a7f79a405de6835635705c37bd007ba4ab218260


    @Override
    public String getRole() {
        return UserRole.SELLER;
    }


    public void addOccupation(String occupation){
        this.occupations.add(occupation);
    }
}
