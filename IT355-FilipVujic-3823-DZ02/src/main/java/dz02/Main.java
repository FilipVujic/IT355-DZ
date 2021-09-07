/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author filip
 */
@Configuration
@ComponentScan
public class Main {


    public static void main(String[] args) {

        ApplicationContext context = getAppContext();
        
        PasService pasService = (PasService) context.getBean("pasService");
        pasService.runPas();
        
        KokoskaService kokoskaService = (KokoskaService) context.getBean("kokoskaService");
        kokoskaService.runKokoska();
        
        OvcaService ovcaService = (OvcaService) context.getBean("ovcaService");
        ovcaService.runOvca();

    }

    @Bean(name = "pasService")
    public PasService getPasService() {
        return new PasService();
    }
    
    @Bean(name = "ovcaService")
    public OvcaService getOvcaService() {
        return new OvcaService();
    }
    
    @Bean(name = "kokoskaService")
    public KokoskaService getKokoskaService() {
        return new KokoskaService();
    }
    
    @Bean(name = "pas")
    public Pas getPas() {
        return new Pas();
    }
    
    @Bean(name = "ovca")
    public Ovca getOvca() {
        return new Ovca();
    }
    
    @Bean(name = "kokoska")
    public Kokoska getKokoska() {
        return new Kokoska();
    }

    public static ApplicationContext getAppContext() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        return context;
    }

}
