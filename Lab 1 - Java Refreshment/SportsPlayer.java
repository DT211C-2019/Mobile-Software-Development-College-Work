public class SportsPlayer {
    private int birthYear;
    private String maleFemale;
    private String country;
    private static short count;

    public SportsPlayer() {
        this.birthYear = 2000;
        this.maleFemale = "Male";
        this.country = "Ireland";
        count++;
    }

    public SportsPlayer(int birthYear, String maleFemale, String country) {
        this.birthYear = birthYear;
        this.maleFemale = maleFemale;
        this.country = country;
        count++;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String isMaleFemale() {
        return this.maleFemale;
    }

    public String getMaleFemale() {
        return this.maleFemale;
    }

    public void setMaleFemale(String maleFemale) {
        this.maleFemale = maleFemale;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "{" + " birthYear='" + getBirthYear() + "'" + ", maleFemale='" + getMaleFemale() + "'" + ", country='"
                + getCountry() + "'" + "}";
    }

}
