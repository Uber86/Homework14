public class Ravenclaw extends  Hogwarts{

    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; //  остроумие
    private int creation; //  творчество

    public Ravenclaw(String name, int witchcraft, int transgress, int mind, int wisdom, int wit, int creation) {
        super(name, witchcraft, transgress);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Когтевран " + super.toString()+
                ", ум: " +  mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + wit +
                ", творчество: " + creation;
    }
}
