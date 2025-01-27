package solidprinciples.liskovsubs;

public class Monkey implements Alive {
    @Override
    public void eat() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void breath() {
        System.out.println("Monkey is Breathing");
    }
}
