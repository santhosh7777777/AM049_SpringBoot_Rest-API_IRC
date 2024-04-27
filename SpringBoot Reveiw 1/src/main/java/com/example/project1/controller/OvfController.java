package com.example.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project1.model.Ovf;
import com.example.project1.repository.OvfRepo;
@RestController
public class OvfController {
    @Autowired
    OvfRepo repo;
    @GetMapping("/customers")
    public List<Ovf> getAllOvf()
    {
        List<Ovf> ovf =repo.findAll();
        return ovf;
    }
    @GetMapping("/customers/{id}")
    public Ovf getOvf(@PathVariable int id)
    {
        Ovf ovf = repo.findById(id).get();
        return ovf;
    }
    @PostMapping("/customers/add")
    public void createOvf(@RequestBody Ovf ovf)
    {
        repo.save(ovf);
    }
    @PutMapping("/customers/update/{id}")
    public void updateOvf(@PathVariable int id)
    {
        Ovf ovf = repo.findById(id).get();
        ovf.setName("Potato");
        ovf.setPrice(45);
        ovf.setCatagory("vegetable");
        repo.save(ovf);
    }
    @DeleteMapping("/customers/delete/{id}")
    public void deleteOvf(@PathVariable int id)
    {
        Ovf ovf = repo.findById(id).get();
        repo.delete(ovf);
    }
}