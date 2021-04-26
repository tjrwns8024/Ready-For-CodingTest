package programmers.two;

import java.util.Arrays;

public class PhoneNumberList {
    public static void main(String[] args) {
        PhoneNumberList phone = new PhoneNumberList();

        String[] list = {"119", "97674223", "1195524421"};
        phone.solution(list);
    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }
}
