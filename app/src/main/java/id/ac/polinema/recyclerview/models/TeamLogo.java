package id.ac.polinema.recyclerview.models;

public class TeamLogo {
public String logo;
public String nama;

public TeamLogo(String logo, String nama){
    this.logo = logo;
    this.nama = nama;
}
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getName() {
        return nama;
    }

    public String getLogo() {
        return logo;
    }
}
