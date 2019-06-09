package application.controllers;

import application.entities.Passports;
import application.repositories.PassoprtsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passports")
public class PassportsController {

    @Autowired
    private PassoprtsRepository passoprtsRepository;

    @CrossOrigin
    @RequestMapping("/all")
    public @ResponseBody Iterable<Passports> getPassports(){
        return passoprtsRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/add")
    public Integer add(@RequestBody Passports newPassport){
        passoprtsRepository.save(newPassport);
        return newPassport.getId();
    }
}
