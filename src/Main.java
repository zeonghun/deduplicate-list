import java.util.ArrayList;
import java.util.Scanner;

/**
 * @brief (non-javadoc)
 * 
 * @author zeonghun
 * @since 230315
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DuplicateCheck duplcheck = new DuplicateCheck(); // 객체 생성

        System.out.print("중복 제거할 문자열을 입력하세요: ");
        String str = sc.nextLine();
        str = str.replaceAll(" ", ""); // 공백 제거

        ArrayList<Character> result = duplcheck.duplcheck(str);
        System.out.println(result);
        sc.close();
    }
}