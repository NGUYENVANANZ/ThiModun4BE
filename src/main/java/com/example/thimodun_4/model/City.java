package com.example.thimodun_4.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nameCity;

    private long area;
    private long population;
    private long GDP;

    private String describe_;

    @ManyToOne
    private Country country;
}
