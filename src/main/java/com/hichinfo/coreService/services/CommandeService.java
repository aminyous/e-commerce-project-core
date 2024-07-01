package com.hichinfo.coreService.services;

import com.hichinfo.coreService.entites.Commande;
import com.hichinfo.coreService.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {
    @Autowired
    private CommandeRepository commandeRepository;

    public CommandeService() {
    }

    public List<Commande> getAllCommandes() {
        return (List<Commande>) commandeRepository.findAll();
    }

    public Commande getCommandeById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    public Commande saveCommande(Commande product) {
        return
                commandeRepository.save
                        (product);
    }


    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
