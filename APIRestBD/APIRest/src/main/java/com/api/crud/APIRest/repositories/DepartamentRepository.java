package com.api.crud.APIRest.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.api.crud.APIRest.models.Departament;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long> {
}