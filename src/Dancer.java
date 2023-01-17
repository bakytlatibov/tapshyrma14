public class Dancer extends Person {
    private String groupName;
    public Dancer(){
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Dancer(String name, String designation, String groupName) {
       super(name,designation);
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("learn"+"dance ");
    }
    @Override
    public void walk() {
        System.out.println("walk: "+"the philharmonic ");
    }

    @Override
    public void eat() {
        System.out.println("eat: "+"light food");
    }

    public void dancing(){
        System.out.println(getGroupName()+"  group is preparing for the competition Asian interethnic dance");
    }public String toString(){
        return "groupName"+","+getGroupName()+"name: "+getName()+","+"designation:  "+getDesignation();
    }
}
