package task1and2;

public class SalariedEmployee extends Employee {

    private double KasaperTydz;

    public SalariedEmployee(String firstName, String lastName, double KasaperTydz) {
        super(firstName, lastName);
        this.KasaperTydz = KasaperTydz;
    }

    protected SalariedEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    private double getKasaperTydz() {
        return KasaperTydz;
    }

    public void setKasaperTydz(double KasaperTydz) {
        this.KasaperTydz = KasaperTydz;
    }

    @Override
    protected double earnings() {
        return getKasaperTydz();
    }

}
