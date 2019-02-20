package model;

public abstract class Character implements Comparable{
    
    public String name;
    public int life;
    public final int max_life;
    public int ah;
    public int damage;
    public int turn;
    //RF,RE,RV,RM,RP
    public int [] resistances;
    
    public Magic magic;
    public Ki ki;
    public Psiquics psiquics;
    public Secundary secundary;

    public Character(String name, int life, int ah, int damage, int turn, int[] resistances, boolean magic, boolean ki, boolean psi, boolean secNegative) {
        this.name = name;
        this.life = life;
        this.max_life = life;
        this.ah = ah;
        this.damage = damage;
        this.turn = turn;
        this.resistances = resistances;
        secundary = new Secundary(name,secNegative);
        if(!magic) this.magic = new Magic();
        else{
            this.magic = FileReadsWrite.readMagicStats(name);
        }
        if(!ki) this.ki = new Ki();
        else{
            this.ki = FileReadsWrite.readKiStats(name);
        }
        if(!psi) psiquics = new Psiquics();
        else{
            //Aquí ira  un metodo que leerá de un archivo que contendrá los datos de los valores del psi
        }
    }
    
    public void loseLife(int damageDeal){
        life = (life - damageDeal) <= 0 ? 0 : life - damageDeal;
    }
    
    public void heal(int healing){
        life = (life + healing) > max_life ? max_life : life + healing;
    }
    
    public int dealDamage(int percentage){
        return (damage*percentage)/100;
    }
    
    public String showStats(){
        
        String res = "Name: " + name + "\n";
        res += "Life: " + life + " (" + max_life + ")" + "\n";
        res += "AH: " + ah + "\n";
        res += "Dmg: " + damage + "\n";
        res += ki.gotKi() ? "-----------------------------------------------------\n" + ki.showStatsKi() : "";
        res += magic.gotMagic() ? "-----------------------------------------------------\n" + magic.showStatsMagic(): "";
        res += psiquics.flag ? "-----------------------------------------------------\n" + psiquics.showStatsPsiquics() : "";
        return res;
    }
    
    public boolean haveMagic(){
        return this.magic.gotMagic();
    }
    public boolean haveKi(){
        return this.ki.gotKi();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.turn;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if(this.turn == other.turn){
            return this.name.equals(obj);
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Character){
            Character tmp = (Character) o;
            return tmp.turn - this.turn;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + "(" + turn + ")}";
    }

    
    
}
