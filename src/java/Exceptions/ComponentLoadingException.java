/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author root
 */
public class ComponentLoadingException extends Exception {

    public ComponentLoadingException() {
        
        super("Could not load component properly. Check your database connection.");
        
    }

}
