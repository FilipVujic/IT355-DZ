/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02.entity;

import dz02.util.Zivotinja;
import org.springframework.stereotype.Component;


/**
 *
 * @author filip
 */
@Component
public class Ovca implements Zivotinja {
    
    @Override
    public void nacinOglasavanja() {
        System.out.println("Ovca kaze beee.");
    }

    @Override
    public void nahraniZivotinju() {
        System.out.println("Ovca je pojela hranu.");
    }
    
    
}
