package task1and2;

public class BaseEmployee extends CommisionEmployee {

    private double podstawaKasa;
    private double cor;

    BaseEmployee(String firstName, String lastName, double grossSalary) {
        super(firstName, lastName, grossSalary);
    }


    private double getpodstawaKasa() {
        return podstawaKasa;
    }

    public void setpodstawaKasa(double podstawaKasa) {
        this.podstawaKasa = podstawaKasa;
    }

    private double getcor() {
        return cor;
    }

    public void setcor(double cor) {
        this.cor = cor;
    }

    @Override
    protected double earnings() {
        return getpodstawaKasa() + super.earnings();
    }
}