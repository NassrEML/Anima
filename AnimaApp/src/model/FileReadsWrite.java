package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class FileReadsWrite {
    
    public static HashMap<String,Integer> readSecundary(String name){
        
        HashMap<String,Integer> res = new HashMap<>();
        
        try {
            name = "data\\Secundarias\\" + name + ".txt";
            File f = new File(name);
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while( (line = bfr.readLine()) != null ){
                
                String [] elements = line.split(",");
                res.put(elements[0], Integer.parseInt(elements[1]));
                
            }
            
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
        
        return res;
        
    }

}
