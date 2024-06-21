class Human {
    private String name;
    private double weight;
    private double height;

    Human(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    String getName() {
        return name;
    }

    double getWeight() {
        return weight;
    }

    double getHeight() {
        return height;
    }

    double calculateBMI() {
        return weight / (height * height);
    }

    double calculateIdealWeight() {
        return (height * height) * 22;
    }
}