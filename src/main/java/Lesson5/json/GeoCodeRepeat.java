package Lesson5.json;

public class GeoCodeRepeat {
    private String country;
    private String ip;

    public GeoCodeRepeat(String country, String ip) {
        this.country = country;
        this.ip = ip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
