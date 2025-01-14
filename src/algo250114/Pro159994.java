package algo250114;

// 카드 뭉치 - Lv1
// 첫 번째 - ["i", "drink", "water"]
// 두 번째 - ["want", "to"]

// 조건
/*
1. 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
2. 한 번 사용한 카드는 다시 사용할 수 없습니다.
3. 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
4. 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
 */

public class Pro159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        // cards1의 인덱스와 cards2의 인덱스 선언
        int idx1 = 0;
        int idx2 = 0;

        // 길이 변수 지정
        int length1 = cards1.length;
        int length2 = cards2.length;

        // goal 배열 순회 - 인덱스를 교차하면서 증가시키기 (문자열 생성 가능 여부 확인 구현)
        for (String str : goal) {
            // str이 cards1[idx1] 또는 cards2[idx2]에 포함되는지 확인
            if (idx1 < length1 && str.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < length2 && str.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        Pro159994 T = new Pro159994();
        System.out.println(T.solution(new String[]{"i", "drink", "water"}
            ,new String[]{"want", "to"}
            ,new String[]{"i", "want", "to", "drink", "water"}));
    }
}
