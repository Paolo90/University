/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serveresercizio_2;
import java.io.*;
import java.net.*;
/**
 *
 * @author paolo
 */
public class ThreadServer extends Thread{
    private Socket client;
    private String nome;
    ThreadServer(Socket client, String nome){
        this.client=client;
        this.nome=nome;
    }
    public void run(){
        BufferedReader in=null;
        PrintWriter out=null;
        String valoreLetto;
        int letto;
        try{
            in=new BufferedReader(new FileReader(nome));
            out=new PrintWriter(client.getOutputStream(),true);
            while((valoreLetto=in.readLine())!=null){
                try{
                    letto=Integer.parseInt(valoreLetto);
                    System.out.println("Letto il valore "+valoreLetto);
                    out.println(letto);
                }catch(NumberFormatException e){
                    e.printStackTrace();
                }
            }
            out.println("BYE");
        }catch(FileNotFoundException e){
            System.err.println("File "+nome+" non trovato");
            System.exit(1);
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(in!=null){
                try{
                    in.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            if(out!=null){
                out.close();
            }
            if(client!=null){
                try{
                    client.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
