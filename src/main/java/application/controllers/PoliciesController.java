package application.controllers;

import application.entities.Policies;
import application.repositories.PoliciesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @CrossOrigin
    @PostMapping("/add")
    public Integer add (@RequestBody Policies newPolicy){
        policiesRepository.save(newPolicy);
        return newPolicy.getNumber();
    }

}
