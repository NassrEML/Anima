package model;

import java.util.ArrayList;

public class Combat {
    
    public static boolean combat(Character ofensive, Character defensive, int roll_o, int roll_d, boolean magic_Combat){
        if(magic_Combat){
            return magicCombat(ofensive, defensive, roll_o, roll_d);
        }else{
            return normalCombat(ofensive, defensive, roll_o, roll_d);
        }
    }
    public static boolean normalCombat(Character ofensive, Character defensive, int roll_o, int roll_d){
        
        int value = ofensive.ah + roll_o;
        if(defensive instanceof HumanCharacter){
            HumanCharacter defen = (HumanCharacter) defensive;
            value -= defen.dh+roll_d;
        }
        
        if (value <= 0) {
            return false;
        }else{
            if(! (value < 10) ){
                value = (value/10)*10;
            }
            defensive.loseLife(ofensive.dealDamage(value));
            return true;
        }
    }
    
    public static boolean magicCombat(Character ofensive, Character defensive, int roll_o, int roll_d){
        
        int value;
        
        if(ofensive.haveMagic()){
            value = ofensive.magic.proj_atck+roll_o;
        }else{
            value = ofensive.ah+roll_o;
        }
        
        if(defensive.haveMagic()){
            value -= defensive.magic.proj_def+roll_d;
        }else{
            value-= defensive.resistances[3]+roll_d;
        }
        
        if(value <= 0){
           return false;
        }else{
            if(! (value < 10) ){
                value = (value/10)*10;
            }
            defensive.loseLife(ofensive.magic.dealMagicDamage(value));
            return true;
        }
        
    }
    
    public static void updateNotNaturalStats(ArrayList<Character> characters){
        
        for (Character character : characters) {
            if(character.haveKi()) character.ki.increment();
            if(character.haveMagic()) character.magic.increment();
        }
        
    }
}
