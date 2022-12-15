package com.example.thimodun_4.repository;

import com.example.thimodun_4.model.Country;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICountry extends CrudRepository<Country, Long> {
    @Query(nativeQuery = true,value = "SELECT * from friend where name_country = :name")
    Country counttry(@Param("name") String name);
}
