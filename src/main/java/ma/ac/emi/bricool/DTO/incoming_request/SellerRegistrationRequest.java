package ma.ac.emi.bricool.DTO.incoming_request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
public class SellerRegistrationRequest {



    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private LocalDate yearsOfBirth;
    private String gender;

    private String city;

    private String occupation;







}
