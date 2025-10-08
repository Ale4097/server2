package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello world!");
        ServerSocket mioServerSocket = new ServerSocket(3000);
        Socket mioSocket = mioServerSocket.accept();
        System.out.println("Benvenuto nel server");

        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);
    
        out.println("versione 2");

        in.readLine();

        int N1 = Integer.parseInt(in.readLine());
        int N2 = Integer.parseInt(in.readLine());

        int op = Integer.parseInt(in.readLine());
        double result = 0;

        do{

        switch (op) {
                
                case 1:
                result = N1 + N2;
                break;

                case 2:
                result = N1 - N2;
                break;

                case 3:
                result = N1 / N2;
                break;

                case 4:
                result = N1 * N2;
                break;
            
        
            default:
            break;
        }


        }while(true);
        
            
            //out.println(result);
            //mioSocket.close();

        }
   
    
}
