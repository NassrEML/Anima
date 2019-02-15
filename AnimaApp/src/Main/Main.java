package Main;

import model.HumanCharacter;

public class Main {
    
    public static void main(String[] args) {
        
        int [] res = {10,10,10,10,10};
        
        HumanCharacter hm = new HumanCharacter("Pedro", 150, 50, 20, 2, res, 0, 0, 0);
        System.out.println(hm.showStats());
        
        hm.ki.decrement(new int [] {1,2,3,4,5});
        System.out.println(hm.showStats());
        
        
    }

}
