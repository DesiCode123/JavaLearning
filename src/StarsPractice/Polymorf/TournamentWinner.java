package StarsPractice.Polymorf;
import java.util.*;

class TournamentWinner {

    public static final int HOME_TEAM_WON = 1;

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        String currentBestTeam = "";
        HashMap<String, Integer> scores = new HashMap<>();

        for(int idx = 0; idx < competitions.size(); idx++){
            ArrayList<String> competition = competitions.get(idx);
            int result = results.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;
            updateScores(winningTeam, 3, scores);

            if(!scores.containsKey(currentBestTeam) || scores.get(winningTeam) > scores.get(currentBestTeam)){
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }

    public void updateScores(String team, int points, HashMap<String, Integer> scores){
        scores.put(team, scores.getOrDefault(team, 0) + points);
    }

    public static void main(String[] args) {
        TournamentWinner p = new TournamentWinner();

        ArrayList<ArrayList<String>> input1 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList("HTML", "Java")),
                        new ArrayList<>(Arrays.asList("Java", "Python")),
                        new ArrayList<>(Arrays.asList("Python", "HTML"))
                )
        );

        ArrayList<Integer> results1 = new ArrayList<>(Arrays.asList(0, 1, 1));

        ArrayList<ArrayList<String>> input2 = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList("HTML", "Java")),
                        new ArrayList<>(Arrays.asList("Java", "Python")),
                        new ArrayList<>(Arrays.asList("Python", "HTML")),
                        new ArrayList<>(Arrays.asList("C#", "Python")),
                        new ArrayList<>(Arrays.asList("Java", "C#")),
                        new ArrayList<>(Arrays.asList("C#", "HTML"))
                )
        );

        ArrayList<Integer> results2 = new ArrayList<>(Arrays.asList(0, 1, 1, 1, 0, 1));

        System.out.println(p.tournamentWinner(input1, results1));  // Forventet output: Java
        System.out.println(p.tournamentWinner(input2, results2));  // Forventet output: C#
    }
}


/*{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"]
  ],
  "results": [0, 1, 1]
}
Test Case 3
{
  "competitions": [
    ["HTML", "Java"],
    ["Java", "Python"],
    ["Python", "HTML"],
    ["C#", "Python"],
    ["Java", "C#"],
    ["C#", "HTML"]
  ],
  "results": [0, 1, 1, 1, 0, 1]
}

 */