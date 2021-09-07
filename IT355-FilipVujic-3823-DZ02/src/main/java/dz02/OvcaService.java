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
public class OvcaService {
    
    @Autowired
    private Ovca ovca;
    
    public void runOvca() {
        ovca.nacinOglasavanja();
        ovca.nahraniZivotinju();
    }

    public Ovca getOvca() {
        return ovca;
    }

    public void setOvca(Ovca ovca) {
        this.ovca = ovca;
    }
    
    
}
