package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MioThread extends Thread {
    Socket mioSocket;

    public MioThread(Socket s) {

        this.mioSocket = s;
    }

    public void run(){

        try {
        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);
    
        out.println("versione 2");

        in.readLine();

        String input;
        while (true) {
            input  = in.readLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }
        
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
        out.println(result);
        
        mioSocket.close();
        }while (true);
    }
        }catch(

    Exception e)
    {
        // TODO: handle exception
    }
}
}
