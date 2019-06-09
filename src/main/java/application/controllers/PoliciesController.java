package application.controllers;

import application.entities.Policies;
import application.repositories.PoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class PoliciesController {

    @Autowired
    private PoliciesRepository policiesRepository;

    @CrossOrigin
    @RequestMapping("/all")
    public @ResponseBody Iterable<Policies> getPolicies (){
        return policiesRepository.findAll();
    }

}
