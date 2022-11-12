import java.util.Objects;

public class Sponsor {
    String name;
    double sponsorship;

    public Sponsor(String name, double sponsorship) {
        this.name = name;
        this.sponsorship = sponsorship;
    }

    public void toSponsor() {
        System.out.println("Я спонсирую на сумму " + sponsorship);
    }

    public String getName() {
        return name;
    }

    public double getSponsorship() {
        return sponsorship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return Double.compare(sponsor.sponsorship, sponsorship) == 0 && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sponsorship);
    }
}
