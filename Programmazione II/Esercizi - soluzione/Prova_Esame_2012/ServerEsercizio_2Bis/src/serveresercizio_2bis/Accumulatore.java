/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2bis;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class Accumulatore {
    private String nomeFile;
    Accumulatore(String nomeFile){
        this.nomeFile=nomeFile;
    }
    String getNome(){
        return nomeFile;
    }
}
