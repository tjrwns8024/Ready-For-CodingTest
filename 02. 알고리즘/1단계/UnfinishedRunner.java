package programmers.one;

import java.util.ArrayList;
import java.util.Arrays;

public class UnfinishedRunner {

    public static void main(String[] args) {
        String[] list = new String[]{"leo", "kiki", "eden"};
        String[] completedList = new String[]{"eden", "kiki"};

        UnfinishedRunner unfinishedRunner = new UnfinishedRunner();
        System.out.println(unfinishedRunner.solution(list, completedList));
    }

    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i = 0;      //a
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }
}