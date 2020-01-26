package task1and2;

public abstract class Employee implements Payable {

    private final String imie;
    private final String nazwisko;

    Employee(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getimie() {
        return imie;
    }

    public String getnazwisko() {
        return nazwisko;
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }

    protected abstract double earnings();

}
