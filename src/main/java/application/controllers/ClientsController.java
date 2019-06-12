package application.controllers;

import application.entities.Clients;
import application.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Clients> getClients (){
        return clientRepository.findAll();
    }

    @PostMapping("/add")
    public Integer add (@RequestBody Clients newClient){
        clientRepository.save(newClient);
        return newClient.getPassportId();
    }

}
