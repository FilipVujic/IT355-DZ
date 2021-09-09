/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02.service;

import dz02.entity.Pas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author filip
 */
@Service
public class PasService {
    
    @Autowired
    private Pas pas;
    
    public void runPas() {
        pas.nacinOglasavanja();
        pas.nahraniZivotinju();
    }

    public Pas getPas() {
        return pas;
    }

    public void setPas(Pas pas) {
        this.pas = pas;
    }

    
    
}
