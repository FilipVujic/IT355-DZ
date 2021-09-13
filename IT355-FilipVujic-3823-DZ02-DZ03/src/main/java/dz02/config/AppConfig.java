/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz02.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author filip
 */
@Configuration
@ComponentScan("dz02.entity, dz02.service, dz02.util")
public class AppConfig {
    
    
}
