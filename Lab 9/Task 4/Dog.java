public class Dog extends Animal {
    public String breed;
    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed=breed;
    }
    public String info() {
        return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\nBreed: "+breed;
    }
    public void makeSound() {
        System.out.println(color+" color "+name+ " is barking");
    }
}