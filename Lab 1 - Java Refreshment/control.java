public class control {
    public static void main(String[] args) {
        SportsPlayer emmaRaducanu = new TennisPlayer(0, "Women", "canada", 1.73, "toronto", "Andrew Richardson", 23,
                "US$2,803,376", "Right-Handed");

        SportsPlayer daniilMedvedev = new TennisPlayer(1996, "Men", "Russia", 1.98, "N/A", "Gilles Cervara", 0,
                "US: $19,793,705", "Right-Handed");

        System.out.println(emmaRaducanu);

        System.out.println(daniilMedvedev);

        System.out.println(daniilMedvedev.getCount());
    }
}