public class ChickenBurger {
    public String bun = "Sesame";
    public int price = 200;
    public String sauceOption = "Less";
    public String spiceLevel = "Not Set";

    public String serveBurger() {
        if (this.spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice Level first.";
        } else {
            String s = "The burger is being served:- \nBun Type: " + this.bun + "\nPrice: " + this.price
                    + "\nSauce Option: " + this.sauceOption + "\nSpice Level: " + this.spiceLevel;
            return s;
        }
    }

    public void customizeSpiceLevel(String level) {
        if (!level.equals("Spicy") && !level.equals("Naga")) {
            System.out.println("This spice level is unavailable.");
        } else if (level.equals("Spicy")) {
            System.out.println("Spice level set to Spicy.");
            this.spiceLevel = "Spicy";
        } else if (level.equals("Naga")) {
            System.out.println(" Spice level set to Naga.");
            this.spiceLevel = "Naga";
        }
    }
}