public class UnitCalculatorImpl implements UnitCalculator{
    public double kilogramToPouind(double kilogram) {
        double pound = kilogram * 2.2;
        System.out.println(kilogram + " kilogrammes = " + pound + " livres");
        return pound;
    }

    public double kilometerToMile(double kilometer) {
        double mile = kilometer * 0.62;
        System.out.println(kilometer + " kilomètres = " + mile + " miles");
        return mile;
    }
}
