package com.ohgiraffers.practice20231006.computerRequest;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ComputerSpecRepository {

    @PersistenceContext
    private EntityManager manager;

    public void save(ComputerSpec computerSpec) {
        manager.persist(computerSpec);
    }
    /*public void contain(ComputerSpec computerSpec) {
        manager.contains(computerSpec);
    }

    public void find(ComputerSpec computerSpec) {
        manager.find(ComputerSpec.class, computerSpec);
    }

    public void detach(ComputerSpec computerSpec) {
        manager.detach(computerSpec);
    }

    public void clear() {
        manager.clear();
    }

    public void close() {
        manager.close();
    }

    public void remove(ComputerSpec computerSpec) {
        manager.remove(computerSpec);
    }*/
}
