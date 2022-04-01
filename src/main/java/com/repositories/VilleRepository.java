package com.repositories;

import com.entity.Ville;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VilleRepository extends CrudRepository<Ville, String> {

    List<Ville> findByPostalCode(String postalCode);

    List<Ville> findByName(String name);

    List<Ville> findByInseeCode(String inseeCode);

    Ville findOneByInseeCode(String inseeCode);
}
