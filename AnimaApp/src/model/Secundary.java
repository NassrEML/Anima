package model;

import java.util.Map;

public class Secundary {
    
    private Map<String,Integer> secundary;
    private boolean negativeStat;

    public Secundary(String name, boolean flag) {
        secundary = FileReadsWrite.readSecundaryStats(name);
        negativeStat = flag;
    }
    
    public int getValue(String skill){
        for (Map.Entry<String, Integer> entry : secundary.entrySet()) {
            String key = entry.getKey();
            if(key.equals(skill)) return entry.getValue();
        }
        return negativeStat ? -20 : 20 ;
    }
    
    public String showSecundarys(){
        String res = "Secundary:\n";
        
        for (Map.Entry<String, Integer> entry : secundary.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            res += key +": " + value + "\n";
        }
        
        return res;
    }

}
