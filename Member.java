public class Member {
    private String name;
    private int ID;

    //Constructor
    public Member(String name, int ID){
        this.name=name;
        this.ID=ID;
    }

    //Getter Methods
    public String getName(){
        return name;
    }

    public int getID(){
        return ID;
    }

    //Setter Methods
    public void setName(String name){
        this.name=name;
    }

    public void setID(int ID){
        this.ID=ID;
    }
}
