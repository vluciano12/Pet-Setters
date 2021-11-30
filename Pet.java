public class Pet{
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet(String n, int a, double w, String t, String b){
        name = n;
        age = a;
        weight = w;
        type = t;
        breed = b;
    }
  
    public Pet(){
        name = "Goldie";
        age = 5;
        weight = 74.96;
        type = "Dog";
        breed = "Golden Retriever";
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }
    
    public String getType(){
        return type;
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return "Name: "  + name + "\nAge: " + age + "\nWeight: " + weight + " lbs\nType: " + type + "\nBreed: " + breed;
    }
}