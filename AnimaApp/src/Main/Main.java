package Main;

import model.HumanCharacter;

public class Main {
    
    public static void main(String[] args) {
        
        int [] res = {10,10,10,10,10};
        HumanCharacter hm = new HumanCharacter("Pedro", 150, 50, 20, 2, res, 0, 0, 0, 20);
        
        System.out.println(hm.showStats());
    }

}
