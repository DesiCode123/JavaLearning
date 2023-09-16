package StarsPractice.Polymorf;

import java.util.*;

class TournamenWinner {

    public int HOME_TEAM_WON = 1;

    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        String currentBestTeam = "";
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        scores.put(currentBestTeam,0);

        for(int idx = 0; idx < competitions.size(); idx++){
            ArrayList<String> competition = competitions.get(idx);
            int result = results.get(idx);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == HOME_TEAM_WON)? homeTeam : awayTeam;
            updateSCores(winningTeam, 3, scores);

            if(scores.get(winningTeam) > scores.get(currentBestTeam)){
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }
    public void updateSCores(String team, int points, HashMap<String,Integer> scores){
        if(!scores.containsKey(team)){
            scores.put(team,0);
        }

        scores.put(team,scores.get(team) + points);

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