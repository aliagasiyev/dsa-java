package solidprinciples.liskovsubs;

public class Mamont implements Alive {
    @Override
    public void eat() {
        System.out.println("Mamont is eating");
    }

    @Override
    public void breath() {
        System.out.println("Mamont is breathing");
    }
    public void cuting (){
        System.out.println("Mamont is cutting");
    }
}
