package application.controllers;

import application.entities.Insurance_types;
import application.repositories.InsuranceTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/types")
public class InsuranceTypesController {

    @Autowired
    private InsuranceTypesRepository insuranceTypesRepository;

    @CrossOrigin
    @RequestMapping("/all")
    public @ResponseBody Iterable<Insurance_types> getTypes(){
        return insuranceTypesRepository.findAll();
    }

}
