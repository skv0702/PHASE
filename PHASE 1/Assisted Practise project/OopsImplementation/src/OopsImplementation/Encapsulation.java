package OopsImplementation;

class Encapsulation1 {
    private String Name;
    private int Roll;
    private int Age;

    public int getAge() { return Age; }
 
    public String getName() { return Name; }

    public int getRoll() { return Roll; }

    public void setAge(int newAge) 
    { 
    	Age = newAge; 
    }

    public void setName(String newName)
    {
        Name = newName;
    }

    public void setRoll(int newRoll) 
    { 
    	Roll = newRoll; 
    }
}
 
public class Encapsulation {
    public static void main(String[] args)
    {
    	Encapsulation1 obj = new Encapsulation1();

        obj.setName("Shubham Kumar Vivek");
        obj.setAge(23);
        obj.setRoll(10);

        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());

    }
}
