package com.hichinfo.coreService.repositories;

import com.hichinfo.coreService.entites.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends CrudRepository<Commande, Long> {
}
