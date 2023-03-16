import java.util.ArrayList;

/**
 * @brief 리스트의 중복을 제거하는 메소드
 * 
 * @param str 중복을 제거할 문자열
 * 
 * @author zeonghun
 * @since 230315
 */
public class DuplicateCheck {
    public ArrayList<Character> duplcheck(String str) {
        ArrayList<Character> list1 = new ArrayList<>(); // 리스트 생성
        ArrayList<Character> list2 = new ArrayList<>(); // 중복 제거한 문자를 담을 리스트
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i); // 각 문자들을 char 타입으로 변환
            list1.add(c); // 각 문자들을 list에 추가
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list2.contains(list1.get(i))) // list2가 list1값을 포함하고 있지 않으면
                list2.add(list1.get(i)); // list2에 추가
        }
        return list2;
    }
}