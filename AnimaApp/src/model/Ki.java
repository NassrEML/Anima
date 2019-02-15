package model;

public class Ki {
    
    //AGI, CON, DES, FUE, POD, VOL
    private int [] charges;
    //AGI, CON, DES, FUE, POD, VOL
    private final int [] increment;
    //AGI, CON, DES, FUE, POD, VOL
    private final int [] max;

    public Ki(int[] ki_increment, int[] maximun_ki_charges) {
        this.charges = new int [6];
        this.increment = ki_increment;
        this.max = maximun_ki_charges;
    }
    
    public Ki() {
        this.charges = new int [6];
        this.increment = new int [6];
        this.max = new int [6];
    }
    
    public void increment(){
        for (int i = 0; i < charges.length; i++) charges[i] = (charges[i] + increment[i]) > max[i] ?  max[i] : charges[i] + increment[i];
    }
    
    public void decrement(int [] cost){
        for (int i = 0; i < cost.length; i++) charges[i] = (charges[i] - cost[i]) < 0 ? 0 : charges[i] - cost[i] ;
    }
    
    public String showStatsKi(){
        
        String res = "Ki:\n";
        
        res += "Stat\tChrg\tInc\tMxChrg\n";
        String [] at = {"AGI", "CON", "DES", "FUE", "POD", "VOL"};
        for (int i = 0; i < charges.length; i++) {
            res += at[i] + "\t";
            res += charges[i] + "\t";
            res += increment[i] + "\t" + max[i];
            res += "\n";
        }
        
        return res;
        
    }

}
