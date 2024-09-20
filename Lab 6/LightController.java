public class LightController {
    public String status = "OFF";
    public int level;

    public void showLightStatus() {
        System.out.println("Light status: " + this.status);
        System.out.println("Brightness level: " + this.level);
    }

    public void adjustBrightness(int brightness) {
        if (this.status == "ON") {
            this.level += brightness;
            if (this.level <= 10 && this.level >= 0) {
                System.out.println("Brightness adjusted");
            } else {
                System.out.println("Brightness out of range. Set between 0 to 10.");
                this.level -= brightness;
            }
        } else {
            System.out.println("Please turn on the light first!");
        }
    }

    public void switchLight() {
        if (this.status == "OFF") {
            this.status = "ON";
            System.out.println("Lights are now ON");
            this.level = 1;
        } else {
            this.status = "OFF";
            System.out.println("Lights are now OFF");
            this.level = 0;
        }
    }

    public String resetSettings() {
        this.level = 1;
        return "Light settings have been reset";
    }
}