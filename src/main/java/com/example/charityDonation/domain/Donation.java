package com.example.charityDonation.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name ="donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();
    @OneToOne(fetch = FetchType.EAGER)
    private Institution institution;
    private String street;
    private String city;
    private String zipCode;
    private String description;
    private String phoneNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;
    //    @DateTimeFormat(pattern = "hh-mm-ss")
    private LocalTime pickUpTime;
    private String pickUpComment;

}
