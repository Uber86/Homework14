public class Hogwarts {

    private String name; // имя
    private int witchcraft; //колдоство
    private int transgress; // трансгрессировать

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    @Override
    public String toString() {
        return "Студент: " + name +
                ", уровень колдовства: " + witchcraft +
                ", трансгрессировать: " + transgress;
    }

}
