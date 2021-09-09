/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

import org.springframework.stereotype.Component;


/**
 *
 * @author filip
 */
@Component
public class Kokoska implements Zivotinja {
    
    @Override
    public void nacinOglasavanja() {
        System.out.println("Kokoska kaze kokodaa.");
    }

    @Override
    public void nahraniZivotinju() {
        System.out.println("Kokoska je pojela hranu.");
    }
    
    
}
