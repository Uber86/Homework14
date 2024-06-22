public class Puffenduy extends Hogwarts {

    private int hardWork; // трудолюбие
    private int loyalty ; // верность
    private int honesty; // честность

    public Puffenduy(String name, int witchcraft, int transgress, int hardWork, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй " + super.toString()+
                ", трудолюбие: " +  hardWork +
                ", верность: " + loyalty +
                ", честность: " + honesty ;
    }
}
