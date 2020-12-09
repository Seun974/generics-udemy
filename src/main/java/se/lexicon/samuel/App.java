package se.lexicon.samuel;


public class App
{
    public static void main( String[] args ) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
       // adelaideCrows.addPlayer(pat);
        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this will not work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResults(fremantle, 1,0);
        hawthorn.matchResults(adelaideCrows, 3,8);

        adelaideCrows.matchResults(fremantle, 2, 1);
       // adelaideCrows.matchResults(baseballTeam,1,1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(fremantle));

        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));


    }
}


//how to sort arraylist

//Arraylist<Team> teams;
//Collections.sort(teams);




    //generics allow us to create classes with type parameters
//
//    ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//                items.add(2);
//                items.add(3);
//                items.add(4);
//                items.add(5);
//
//                printDoubled(items);
//                }
//
//private static void printDoubled(ArrayList<Integer> n) {
//        for (int i : n){
//        System.out.println( i * 2);
//        }