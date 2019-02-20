package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class FileReadsWrite {
    
    public static HashMap<String,Integer> readSecundaryStats(String name){
        
        HashMap<String,Integer> res = new HashMap<>();
        
        try {
            name = "data/Secundarias/" + name + ".txt";
            File f = new File(name);
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while( (line = bfr.readLine()) != null ){
                
                String [] elements = line.split(",");
                res.put(elements[0], Integer.parseInt(elements[1]));
                
            }
            
        } catch (Exception e) {
            //System.out.println(e.getCause());
        }
        
        return res;
        
    }
    
    public static Magic readMagicStats(String name){
        Magic res;
        try {
            name = "data/Magic/" + name + ".txt";
            File f = new File(name);
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            int index = 0;
            int [] tmp = new int [8];
            while( (line = bfr.readLine()) != null ){
                String [] elements = line.split(",");
                tmp[index] = Integer.parseInt(elements[1]);
                index++;
            }
            return new Magic(tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7]);
        } catch (Exception e) {
            //System.out.println(e.getCause());
            return new Magic();
        }
    }
    
    public static Ki readKiStats(String name){
        try {
            int [] tmp = new int [12];
            name = "data/Ki/" + name + ".txt";
            File f = new File(name);
            FileReader fr = new FileReader(f);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            int index = 0;
            while( (line = bfr.readLine()) != null ){
                String [] elements = line.split(",");
                tmp[index] = Integer.parseInt(elements[1]);
                index++;
                tmp[index] = Integer.parseInt(elements[2]);
                index++;
            }
            return new Ki(new int [] {tmp[0],tmp[2],tmp[4],tmp[6],tmp[8],tmp[10]}, new int []{tmp[1],tmp[3],tmp[5],tmp[7],tmp[9],tmp[11]});
        } catch (Exception e) {
            //System.out.println(e.getCause());
            return new Ki();
        }
    }

}
