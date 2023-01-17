public class Singer extends Person{
  private String bandName;
  public void singing(){
    System.out.println(getBandName()+"singing: 'Moe sedse'");
  }
  public void playGitar(){
    System.out.println(getBandName()+"  playing classical guitar");
  }

  @Override
  public void learn() {
    System.out.println("learn: "+"play the guitar  ");
  }public void walk(){
    System.out.println("walk: "+"in a music school");
  }

  @Override
  public void eat() {
    System.out.println("eat: "+"healthy food");
  }

  public String getBandName() {
    return bandName;
  }
  public void setBandName(String bandName) {
    this.bandName = bandName;
  }
  public Singer(String bandName,String name, String designation ){
    super(name,designation);
    this.bandName=bandName;
  }public String toString(){
    return "bandName :"+getBandName()+","+"name: "+getName()+","+"designation"+getDesignation();
  }


  }

