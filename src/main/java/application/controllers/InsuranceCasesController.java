package application.controllers;

import application.entities.Insurance_cases;
import application.repositories.InsuranceCasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cases")
public class InsuranceCasesController {

    @Autowired
    private InsuranceCasesRepository insuranceCasesRepository;

    @CrossOrigin
    @RequestMapping("/all")
    public @ResponseBody Iterable<Insurance_cases> getCases(){
        return insuranceCasesRepository.findAll();
    }

}
