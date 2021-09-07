/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author filip
 */
@Service
public class KokoskaService {
    
    @Autowired
    private Kokoska kokoska;
    
    public void runKokoska() {
        kokoska.nacinOglasavanja();
        kokoska.nahraniZivotinju();
    }

    public Kokoska getKokoska() {
        return kokoska;
    }

    public void setKokoska(Kokoska kokoska) {
        this.kokoska = kokoska;
    }
    
    
}
