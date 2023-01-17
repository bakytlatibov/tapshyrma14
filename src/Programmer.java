public class Programmer extends Person {

    private String componyName;
    public  Programmer(){
    }
    public Programmer(String componyName,String name, String designation) {
        super(name, designation);
        this.componyName = componyName;
    }
    public String getComponyName() {
        return componyName;
    }
    public void setComponyName(String componyName) {
        this.componyName = componyName;
    }
    public void coding(){

        System.out.println(getName()+"  coding banking aplication ");
    }

    @Override
    public void learn() {
        System.out.println("learn: "+"encode");
    }

    @Override
    public void walk() {
        System.out.println("walk: "+"on Campus");
    }

    @Override
    public void eat() {

        System.out.println("eat: "+"bars");
    }

    @Override
    public String toString() {
        return "componyName  : "+ getComponyName()+","+"name :"+getName()+","+"designation  :  "+getDesignation();

    }
}
