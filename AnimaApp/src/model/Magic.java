package model;

public class Magic {
    
    private int zeon_act;
    private int zeon;
    public int proj_atck;
    public int proj_def;
    public int convene;
    public int domination;
    public int tie;
    public int unconvene;
    private boolean flag;
    
    public Magic(int zeon_act, int zeon, int proy_atck, int proy_def, int convene, int domination, int tie, int unconvene) {
        this.zeon_act = zeon_act;
        this.zeon = zeon;
        this.proj_atck = proy_atck;
        this.proj_def = proy_def;
        this.convene = convene;
        this.domination = domination;
        this.tie = tie;
        this.unconvene = unconvene;
        flag = true;
    }
    
    public Magic() {
        this.zeon_act = 0;
        this.zeon = 0;
        this.proj_atck = 0;
        this.proj_def = 0;
        this.convene = 0;
        this.domination = 0;
        this.tie = 0;
        this.unconvene = 0;
        flag = false;
    }
    
    public void increment(){
        if(flag) zeon = flag ? zeon + zeon_act : 0;
    }
    
    public void decrement(){
        if(flag) zeon = ((zeon - zeon_act) < 0) ? 0 : zeon - zeon_act;
    }
    
    public int dealMagicDamage(int percentage){
        if(flag)return (proj_atck*percentage)/100;
        else return 0;
    }
    
    public String showStatsMagic(){
        String res = "Magic:\n";
        res += "Zeon act.: " + zeon_act + "\n";
        res += "Zeon: " + zeon + "\n";
        res += "Atack Projection: " + proj_atck + "\n";
        res += "Defensive Projection: " + proj_def + "\n";
        res += "Invocation Stats:" + "\n";
        res += "Conv\tDom\tTie\tCaOf" + "\n";
        res += convene + "\t" + domination + "\t" + tie + "\t" + unconvene + "\n";
        return res;
    }
    
    public boolean gotMagic(){
        return flag;
    }

}
