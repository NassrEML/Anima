package model;

public class Psiquics {
    
    private int proj_atck;
    private int proj_def;
    public boolean flag;

    public Psiquics(int proj_atck, int proj_def) {
        this.proj_atck = proj_atck;
        this.proj_def = proj_def;
        flag = true;
    }

    public Psiquics() {
        proj_atck = 0;
        proj_def = 0;
        flag = false;
    }
    
    public String showStatsPsiquics(){
        String res = "Psiquics:\n";
        res += "Atack Projection: " + proj_atck + "\n";
        res += "Defensive Projection: " + proj_def + "\n";
        return res;
    }

}
