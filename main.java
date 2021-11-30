public class main{
    public static void main(String args[]){
        Pet pet1 = new Pet();
        Pet pet2 = new Pet("Archie", 2, 0.5, "Goldfish", "Cosmic");

        System.out.println(pet1);
        System.out.println(pet2);
        pet1.setName("Watt");
        pet1.setAge(3);
        pet1.setWeight(60.55);
        pet1.setType("Cat");
        pet1.setBreed("Tabby");
        System.out.println(pet1);
    }
}