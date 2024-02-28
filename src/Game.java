
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Game {
    private static final List<String> tokens = Arrays.asList("R", "B", "G", "Y");
    //private List<String> gameList = new ArrayList<>();


    public List<String> generateRandomString() {
        Random rand = new Random();
        List<String> list = rand.ints(0, tokens.size())
            .limit(4)
            .mapToObj(tokens::get)
            .collect(Collectors.toList());
        return list;
    }

    public String compareString(String input, List<String> gameList) {
        List<String> playerList = Arrays.asList(input.split(""));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).equals(gameList.get(i))) {
                sb.append("Y");
            } else {
                sb.append("N");
            }
        }
        return sb.toString();
    }

    
}
