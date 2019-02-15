package model;

public class Psiquics {
    
    public int proj_atck;
    public int proj_def;

    public Psiquics(int proj_atck, int proj_def) {
        this.proj_atck = proj_atck;
        this.proj_def = proj_def;
    }

    public Psiquics() {
        proj_atck = 0;
        proj_def = 0;
    }
    
    public String showStatsPsiquics(){
        String res = "Psiquics:\n";
        res += "Atack Projection: " + proj_atck + "\n";
        res += "Defensive Projection: " + proj_def + "\n";
        return res;
    }

}
