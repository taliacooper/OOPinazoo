public class Runner {

    public static void main(String[] args) {

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn x = new Unicorn("Rarity");
        Bee Stinger = new Bee("Stinger");

        Animal[] animals = {tigger, pooh,x,Stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals, "meat");

    }

}