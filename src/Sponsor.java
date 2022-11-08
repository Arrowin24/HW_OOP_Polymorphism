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
}
