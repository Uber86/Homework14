public class Main {
    public static void main(String[] args) {

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", 8, 4, 4, 5, 6),
                new Gryffindor("Гермиона Грейнджер", 7, 7, 7, 7, 7),
                new Gryffindor("Рон Уизли",6,5,4,3,5)
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой",5,3,5,4,6,5,6),
                new Slytherin("Грэхэм Монтегю",6,3,4,7,2,2,3),
                new Slytherin("Грегори Гойл",5,1,2,5,8,2,1)
        };

        Puffenduy[] puffenduys = {
                new Puffenduy("Захария Смит", 4, 5, 6, 7, 4),
                new Puffenduy("Седрик Диггори", 5, 4, 5, 5, 5),
                new Puffenduy("Джастин Финч-Флетчли", 6, 5, 3, 1, 2)
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", 5, 5, 5, 5, 4, 2),
                new Ravenclaw("Падма Патил", 3, 3, 2, 5, 7, 4),
                new Ravenclaw("Маркус Белби", 5, 5, 5, 3, 4,5)
        };

        StudentСomparison studentСomparison = new StudentСomparison();
        studentСomparison.print(gryffindors);
        studentСomparison.print(slytherins);
        studentСomparison.print(puffenduys);
        studentСomparison.print(ravenclaws);

    }

}