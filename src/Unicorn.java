public class Unicorn extends Animal {
//    // put your instance variables here!
//    String name;
//    String favoriteFood;
//

    public Unicorn(String name) {
        super(name, "marshmallows");

    }


    public void sleep() {
        System.out.println(name + " sleeps in a cloud");

    }
    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food == this.favoriteFood) {

            System.out.println("YUM!!! " + this.name + " wants more " + food);
            sleep();
        } else {
            sleep();
        }
    }


}