package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContactsService {

    @Autowired
    ContactsRepository repository;

    public List<Contact> getAll() {
        List<Contact> employeeList = repository.findAll();

        if (employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<>();
        }
    }

    public Contact getById(Long id) throws Exception {
        Optional<Contact> employee = repository.findById(id);

        if (employee.isPresent()) {
            return employee.get();
        } else {
            throw new Exception("No contact for given id " + id);
        }
    }

    public Contact create(Contact entity) throws Exception {
        entity = repository.save(entity);
        return entity;
    }

}