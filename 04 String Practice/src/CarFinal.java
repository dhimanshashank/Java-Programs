public class CarFinal {
    final int numberOfWheels;
    final String model;
    final int engineInLitres;

    public CarFinal(int numberOfWheels, String model, int engineInLitres) {
        this.numberOfWheels = numberOfWheels;
        this.model = model;
        this.engineInLitres = engineInLitres;
    }

    // cannot update the final variables and should be initialized in declaration or in constructor only :)
}
