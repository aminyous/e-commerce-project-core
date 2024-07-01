package com.hichinfo.coreService.controllers;

import com.hichinfo.coreService.entites.Commande;
import com.hichinfo.coreService.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commande")
public class CommandeController {

    @Autowired
    private CommandeService commandeService;

    public CommandeController() {

    }

    @GetMapping
    public List<Commande> getAll() {
        return commandeService.getAllCommandes();
    }


    @GetMapping("/{id}")
    public Commande getById(@PathVariable Long id) {
        return commandeService.getCommandeById(id);
    }

    @PostMapping
    public Commande saveProduct(@RequestBody Commande commande) {
        return commandeService.saveCommande(commande);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        commandeService.deleteCommande(id);
    }
}
