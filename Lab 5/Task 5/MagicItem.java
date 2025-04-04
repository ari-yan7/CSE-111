public class MagicItem {
    public int energy;
    public String character;
    public String[] items = new String[3];
    public boolean found = false;

    public void newMagicItem() {
        this.items = null;
    }

    public void newCharacter(String character) {
        this.character = character;
        this.energy = 0;
    }

    public void displayInfo() {
        System.out.println("Character Name: " + character);
        System.out.println("Energy Level: " + energy);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Item " + (i + 1) + ":" + this.items[i]);
        }
    }

    public void findItem(String name) {
        if (this.items[0] == null) {
            this.items[0] = name;
            System.out.println(this.character + " found a " + name);
        } else if (this.items[1] == null) {
            this.items[1] = name;
            System.out.println(this.character + " found a " + name);
        } else if (this.items[2] == null) {
            this.items[2] = name;
            System.out.println(this.character + " found a " + name);
        } else {
            System.out.println("All item slots occupied.");
        }
    }

    public void useItem(String name) {
        for (int i = 0; i <= 2; i++) {
            if (this.items[i] == name) {
                this.found = true;
                System.out.println(this.character + " used a " + this.items[i]);
                if (this.items[i] == "Potion") {
                    this.energy += 50;
                    this.items[i] = null;
                    break;
                } else if (this.items[i] == "Elixir") {
                    this.energy += 100;
                    this.items[i] = null;
                    break;
                } else if (this.items[i] == "Amulet") {
                    this.energy += 200;
                    this.items[i] = null;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Item not in inventory.");
        } else {
            System.out.println("Energy Level after using item: " + this.energy);
        }
    }
}