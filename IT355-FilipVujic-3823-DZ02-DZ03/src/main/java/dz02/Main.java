/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02;

import dz02.config.AppConfig;
import dz02.service.OvcaService;
import dz02.service.KokoskaService;
import dz02.service.PasService;
import dz02.util.InterceptorLog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author filip
 */
public class Main {
    
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        
        PasService pasService = (PasService) context.getBean("pasService");
        pasService.runPas();

        KokoskaService kokoskaService = (KokoskaService) context.getBean("kokoskaService");
        kokoskaService.runKokoska();

        OvcaService ovcaService = (OvcaService) context.getBean("ovcaService");
        ovcaService.runOvca();

    }

}
