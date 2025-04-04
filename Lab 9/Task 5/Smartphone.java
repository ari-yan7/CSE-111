public class Smartphone {
    public String name;
    public String[] display = new String[2];
    public String[] ram = new String[2];
    public boolean ramfound = false;

    public Smartphone(){

    }
    public void addFeature(String category, String feature) {
        if (this.name == null) {
            System.out.println("Feature can not be added without phone name");
        } else {
            if (category.equals("Display")) {
                for (int i = 0; i < 2; i++) {
                    if (this.display[i] == null) {
                        this.display[i] = feature;
                        break;
                    }
                }
            } else if (category.equals("Ram")) {
                this.ramfound = true;
                for (int i = 0; i < 2; i++) {
                    if (this.ram[i] == null) {
                        this.ram[i] = feature;
                        break;
                    }
                }
            }
        }
    }

    public void updateName(String name) {
        this.name = name;
    }

    public Smartphone(String name) {
        this.name = name;
    }

    public void printDetail() {
        System.out.println("Phone Name: " + this.name);
        for (int i = 0; i < 2; i++) {
            if (i == 0 && this.display[i] != null) {
                System.out.print("Display: " + this.display[i]);
            } else if (i > 0 && this.display[i] != null) {
                System.out.print(", " + this.display[i]);
            }
        }
        System.out.println();
        if (this.ramfound){
            for (int i = 0; i < 2; i++) {
                if (i == 0 && this.ram[i] != null) {
                    System.out.print("Ram: " + this.ram[i]);
                } else if (i > 0 && this.ram[i] != null) {
                    System.out.print(", " + this.ram[i]);
                }
            }
            System.out.println();
        }
    }
}