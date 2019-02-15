package model;

public abstract class Character {
    
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

    public Character(String name, int life, int ah, int damage, int turn, int[] resistances, int zeon, int ki, int psi) {
        this.name = name;
        this.life = life;
        this.max_life = life;
        this.ah = ah;
        this.damage = damage;
        this.turn = turn;
        this.resistances = resistances;
        if(zeon == 0) magic = new Magic();
        else{
            //Aquí ira  un metodo que leerá de un archivo que contendrá los datos de los valores de las magias
        }
        if(ki == 0) this.ki = new Ki();
        else{
            //Aquí ira  un metodo que leerá de un archivo que contendrá los datos de los valores del ki
        }
        if(psi == 0) psiquics = new Psiquics();
        else{
            //Aquí ira  un metodo que leerá de un archivo que contendrá los datos de los valores del ki
        }
    }
    
    public String showStats(){
        
        String res = "";
        res += "Name: " + name + "\n";
        res += "Life: " + life + " (" + max_life + ")" + "\n";
        res += "AH: " + ah + "\n";
        res += "Dmg: " + damage + "\n";
        res += "-----------------------------------------------------\n";
        res += ki.showStatsKi();
        res += "-----------------------------------------------------\n";
        res += magic.showStatsMagic();
        res += "-----------------------------------------------------\n";
        res += psiquics.showStatsPsiquics();
        return res;
    }

}