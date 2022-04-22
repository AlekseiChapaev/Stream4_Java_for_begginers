package homework.hw_7;

public class Main {




    public static void main(String[] args) {

        Cats[] cats = new Cats[]{
                new Cats("Мурзик", "Black", 2),
                new Cats("Рыжик", "Grey", 3),
                new Cats("Мурка", "Brown", 6),
                new Cats("Васька", "Red", 1),
                new Cats("Черныш", "Grey", 1),
                new Cats("Дымка", "Red", 5),
                new Cats("Патрик", "Grey", 6),
                new Cats("Зорро", "Brown", 3)
        };

        Utils.printCatsNames(cats);
    }

}
