public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Peaksoft","Bakyt","Java");
        System.out.println(programmer.toString());
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println(">>>>>>>>>>>>>");

        Dancer dancer=new Dancer("Aibiyke","National dances","Akkuular");
        System.out.println(dancer.toString());
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println(">>>>>>>>>>>>>>");

        Singer singer=new Singer("Sprint","Sergei","na gitare");
        System.out.println(singer.toString());
        singer.singing();
        singer.playGitar();
        singer.learn();
        singer.walk();
        singer.eat();



    }

}