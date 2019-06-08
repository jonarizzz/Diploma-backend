package application;

import application.entities.Clients;
import application.entities.Clients;
import application.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Clients> getClients (){
        return clientRepository.findAll();
    }

}
