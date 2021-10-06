public class TennisPlayer extends SportsPlayer {
    private Double height;
    private String townCityBorn;
    private String coach;
    private int ranking;
    private String prize;
    private String plays;

    public TennisPlayer(int birthYear, String maleFemale, String country, Double height, String townCityBorn,
            String coach, int ranking, String price, String plays) {
        super(birthYear, maleFemale, country);
        this.height = height;
        this.townCityBorn = townCityBorn;
        this.coach = coach;
        this.ranking = ranking;
        this.prize = price;
        this.plays = plays;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getTownCityBorn() {
        return this.townCityBorn;
    }

    public void setTownCityBorn(String townCityBorn) {
        this.townCityBorn = townCityBorn;
    }

    public String getCoach() {
        return this.coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getPrice() {
        return this.prize;
    }

    public void setPrice(String price) {
        this.prize = price;
    }

    public String getPlays() {
        return this.plays;
    }

    public void setPlays(String plays) {
        this.plays = plays;
    }

    @Override
    public String toString() {
        return "{" + " birthYear='" + getBirthYear() + "'" + " maleFemale='" + getMaleFemale() + "'" + " country='"
                + getCountry() + "'" + " height='" + getHeight() * 3.28084 + " ft'" + ", townCityBorn='"
                + getTownCityBorn() + "'" + ", coach='" + getCoach() + "'" + ", ranking='" + getRanking() + "'"
                + ", prize='" + getPrice() + "'" + ", plays='" + getPlays() + "'" + "}";
    }

}
