package task1and2;

public class CommisionEmployee extends Employee {

    private double kasaperRok;
    private double coR;
    private double sprzedazRok;


    CommisionEmployee(String imie, String nazwisko, double kasaperRok) {
        super(imie, nazwisko);
        this.kasaperRok = kasaperRok;
    }

    private double getkasaperRok() {
        return kasaperRok;
    }

    public void setkasaperRok(double kasaperRok) {
        this.kasaperRok = kasaperRok;
    }

    private double getcoR() {
        return coR;
    }

    public void setcoR(double coR) {
        this.coR = coR;
    }

    public double getsprzedazRok() {
        return sprzedazRok;
    }

    public void setsprzedazRok(double sprzedazRok) {
        this.sprzedazRok = sprzedazRok;
    }

    @Override
    protected double earnings() {
        return getkasaperRok()*getcoR();
    }

}
