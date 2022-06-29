package slimeLand;


public class Potion extends Item {
    public int ItemHP;
    public int ItemMP;
    
    public Potion(int hp, int mp, int number) {
        this.ItemHP = hp;
        this.ItemMP = mp;
        this.Itemumber = number;

        
    }
    
    public void potionEffect(int input) {
        if(input==Itemumber) {
        if (ItemHP>0 && ItemMP==0) {
            Warrior.hp+=ItemHP;
        System.out.println("HP "+ItemHP+" 이 회복되었습니다");
        }
        
        if (ItemMP>0 && ItemHP==0) {
            Warrior.mp+=ItemMP;
        System.out.println("MP "+ItemMP+" 이 회복되었습니다");
        }

        if (ItemHP>0 && ItemMP>0) {
            Warrior.hp+=ItemHP;
        System.out.println("HP "+ItemHP+" 이 회복되었습니다");
            Warrior.mp+=ItemMP;
        System.out.println("MP "+ItemMP+" 이 회복되었습니다");
        }  
    }      
    }

    public redpotion(String Name, int number, int result) {
        this.ItemName = Name;
        this.Itemumber = number;
        this.ItemResult = result;
    }
    public bluepotion(String Name, int number, int result) {
        this.ItemName = Name;
        this.Itemumber = number;
        this.ItemResult = result;
    }
    public powerpotion(String Name, int number, int result) {
        this.ItemName = Name;
        this.Itemumber = number;
        this.ItemResult = result;
    }
    public fullpotion(String Name, int number, int result) {
        this.ItemName = Name;
        this.Itemumber = number;
        this.ItemResult = result;
    }

    public void useItem(int potionnumber) {
        Warrior.hp+=this.ItemResult;
        
    }

    
    // Potion redpotion = new Potion(1,30);
    // Potion redpotion = new Potion(1,30);
    // Potion redpotion = new Potion(1,30);
    // Potion redpotion = new Potion(1,30);
    // Potion redpotion = new Potion(1,30);
    // Potion redpotion = new Potion(1,30);


}

