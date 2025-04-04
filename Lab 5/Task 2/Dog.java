public class Dog {
    public String name;
    public String color;

    public Dog() {
        this.name = null;
        this.color = null;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeColor(String color) {
        this.color = color;
        if (this.name == null && this.color != null) {
            System.out.println("This dog is " + this.color);
        } else if (this.name != null && this.color != null) {
            System.out.println(this.name + " is " + this.color);
        }
    }

    public String bark() {
        if (this.name == null && this.color == null) {
            return "A dog is barking";
        } else if (this.name != null && this.color != null) {
            return this.name + " the " + this.color + " dog is barking";
        } else if (this.name == null && this.color != null) {
            return this.color + " dog is barking";
        } else {
            return this.name + " is barking";
        }
    }
}