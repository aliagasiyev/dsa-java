package solidprinciples.liskovsubs;

public class AnimalApp {
    public static void main(String[] args) {
        Alive mamont = new Mamont();
        mamont.eat();
        mamont.breath();

        Alive monkey = new Monkey();
        monkey.eat();
        monkey.eat();
    }
}
