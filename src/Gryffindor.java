public class Gryffindor extends Hogwarts{

    private int nobility; // блогородство
    private int honor; // честь
    private int bravery; // храбрость

    public Gryffindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int sum() {
        return nobility + honor + bravery;
    }

    public void comparison(Gryffindor candidate) {
        if (sum() > candidate.sum()) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + candidate.getName());
        } else {
            System.out.println(candidate.getName() + " лучший Гриффиндорец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Гриффиндор " + super.toString()+
                ", блогородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery ;
    }
}
