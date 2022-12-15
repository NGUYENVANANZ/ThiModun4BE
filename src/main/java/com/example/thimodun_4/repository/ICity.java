package com.example.thimodun_4.repository;

import com.example.thimodun_4.model.City;
import com.example.thimodun_4.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICity extends CrudRepository<City, Long> {
    @Query(nativeQuery = true,value = "SELECT * from city where name_city = :nameCity")
    City city(String nameCity);

}
