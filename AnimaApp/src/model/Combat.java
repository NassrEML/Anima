package model;

public class Combat {
    
    public static boolean magicAtack(Character ofensive, Character defensive, int roll_o, int roll_d){
        
        if(ofensive.haveMagic()){
            
            int value = (ofensive.magic.proj_atck+roll_o)-(defensive.resistances[3]+roll_d);
            
            if(value <= 0){
                return false;
            }else{
                if(! (value < 10) ){
                    value = (value/10)*10;
                }
                defensive.loseLife(ofensive.magic.dealMagicDamage(value));
                return true;
            }
            
        }else{
            return false;
        }
        
    }
    public static boolean magicDefense(Character ofensive, Character defensive, int roll_o, int roll_d){
        
        if(ofensive.haveMagic() && defensive.haveMagic()){
            
            int value = (ofensive.magic.proj_atck+roll_o)-(defensive.magic.proj_def+roll_d);
            
            if(value <= 0){
                return false;
            }else{
                if(! (value < 10) ){
                    value = (value/10)*10;
                }
                defensive.loseLife(ofensive.magic.dealMagicDamage(value));
                return true;
            }
            
        }else if(ofensive.haveMagic()){
            return magicAtack(ofensive, defensive, roll_o, roll_d);
        }else{
            return false;
        }
        
    }
    
    public static boolean atack(Character ofensive, Character defensive, int roll_o, int roll_d){
        
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
            defensive.loseLife(value);
            return true;
        }
    }
    
}
