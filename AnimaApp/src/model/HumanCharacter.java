package model;

public class HumanCharacter extends Character{
    
    public int dh;
    
    public HumanCharacter(String name, int life, int ah, int dh,int damage, int turn, int[] resistances, boolean magic, boolean ki, boolean psi,boolean secNegative) {
        super(name, life, ah, damage, turn, resistances, magic, ki, psi, secNegative);
        this.dh = dh;
    }

    @Override
    public String showStats() {
        String res = "";
        res += "Name: " + name + "\n";
        res += "Life: " + life + " (" + max_life + ")" + "\n";
        res += "AH: " + ah + "\n";
        res += "DH: " + dh + "\n";
        res += "Dmg: " + damage + "\n";
        res += ki.gotKi() ? "-----------------------------------------------------\n" + ki.showStatsKi() : "";
        res += magic.gotMagic() ? "-----------------------------------------------------\n" + magic.showStatsMagic(): "";
        res += psiquics.flag ? "-----------------------------------------------------\n" + psiquics.showStatsPsiquics() : "";
        return res;
    }
    
}
