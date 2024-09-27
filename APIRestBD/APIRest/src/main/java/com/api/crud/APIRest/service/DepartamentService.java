package com.api.crud.APIRest.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.crud.APIRest.models.Departament;
import com.api.crud.APIRest.repositories.DepartamentRepository;

@Service
public class DepartamentService {
    @Autowired
    private DepartamentRepository departamentRepository;

    public List<Departament> findAll() {
        return departamentRepository.findAll();
    }

    public Optional<Departament> findById(Long id) {
        return departamentRepository.findById(id);
    }

    public Departament save(Departament departament) {
        return departamentRepository.save(departament);
    }
    public void deleteById(Long id) {
        departamentRepository.deleteById(id);
    }
}
