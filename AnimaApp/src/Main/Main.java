package Main;

import java.util.TreeSet;
import model.HumanCharacter;

public class Main {
    
    public static void main(String[] args) {

        int [] res = {10,10,10,10,10};
        HumanCharacter pedro = new HumanCharacter("Pedro", 150, 50, 20, 20, 90, res, true, true, false, true);
        HumanCharacter alfonso = new HumanCharacter("Alfonso", 100, 80,  20, 90, 80, res, false, false, false, true);
        HumanCharacter jose = new HumanCharacter("José", 100, 80,  20, 90, 10, res, false, false, false, true);
        HumanCharacter antonio = new HumanCharacter("Antonio", 100, 80,  20, 90, 90, res, false, false, false, true);
        
        TreeSet<HumanCharacter> characters = new TreeSet<>();
        
        characters.add(pedro);
        characters.add(alfonso);
        characters.add(jose);
        characters.add(antonio);
        
        System.out.println(characters.toString());
        
    }

}
