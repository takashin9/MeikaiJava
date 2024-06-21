import Human;
calss Kadai1 {
    public static void main(String[] args) {
        Human hanano = new Human("華乃", 55.0, 1.70);
        Human emari  = new Human("絵真理", 43.0, 1.53);
        Human aika   = new Human("愛佳", 42.5, 1.55);

        System.out.println("----" + hanano.getName() + "のBMIと適正体重----");
        System.out.println("BMI : " + hanano.calculateBMI());
        System.out.println("適正体重 : " + hanano.calculateIdealWeight());

        System.out.println("----" + emari.getName() + "のBMIと適正体重----");
        System.out.println("BMI : " + emari.calculateBMI());
        System.out.println("適正体重 : " + emari.calculateIdealWeight());

        System.out.println("----" + aika.getName() + "のBMIと適正体重----");
        System.out.println("BMI : " + aika.calculateBMI());
        System.out.println("適正体重 : " + aika.calculateIdealWeight());
    }
}