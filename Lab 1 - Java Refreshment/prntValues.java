public interface prntValues {

    public static void ShowNacionality(TennisPlayer Player) {
        System.out.println(Player.getTownCityBorn());
    }

    public static void ShowAge(TennisPlayer Player) {
        System.out.println(2022 - Player.getBirthYear());
    }
}
