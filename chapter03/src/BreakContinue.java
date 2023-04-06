/**
 * break、continue
 * label:for:结束label--break label;continue label
 */
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
//                break;
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        //
        label:
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j % 4 == 0) {
                    break label;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
