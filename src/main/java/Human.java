public class Human {
    private int hitPoints;
    private String charName;
    private String charClass;

    public Human (String charName, String charClass, int hitPoints){
        this.charName = charName;
        this.charClass =charClass;
        this.hitPoints = hitPoints;
    }

    public void setCharName(String charName){
        this.charName = charName;
    }


}

