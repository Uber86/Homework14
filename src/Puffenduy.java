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

    public int sum() {
        return hardWork + loyalty + honesty;
    }

    public void comparison(Puffenduy candidate) {
        if (sum() > candidate.sum()) {
            System.out.println(getName() + " лучший Пуффендуец, чем " + candidate.getName());
        } else {
            System.out.println(candidate.getName() + " лучший Пуффендуец, чем " + getName());
        }
    }

    @Override
    public String toString() {
        return "Пуффендуй " + super.toString()+
                ", трудолюбие: " +  hardWork +
                ", верность: " + loyalty +
                ", честность: " + honesty ;
    }
}
