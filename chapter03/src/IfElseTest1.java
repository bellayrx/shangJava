/**
 * 岳小鹏参加Java考试，他和父亲岳不群达成承诺：
 * 如果：
 * 成绩为100分时，奖励一辆跑车；
 * 成绩为(80，99]时，奖励一辆山地自行车；
 * 当成绩为[60,80]时，奖励环球影城一日游；
 * 其它时，胖揍一顿。
 * <p>
 * 说明：默认成绩是在[0,100]范围内
 * 当条件表达式之间是“`互斥`”关系时（即彼此没有交集），条件判断语句及执行语句间顺序无所谓。
 * <p>
 * 当条件表达式之间是“`包含`”关系时，“`小上大下 / 子上父下`”，否则范围小的条件表达式将不可能被执行。
 * <p>
 * else可以不要
 */
public class IfElseTest1 {
    public static void main(String[] args) {
        int score = 61;
        /*if (score == 100) {
            System.out.println("奖励一辆跑车");
        } else if (score > 80 && score <= 99) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60 && score <= 80) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }*/
        score = 88;
        /*if (score == 100) {
            System.out.println("奖励一辆跑车");
        } else if (score > 80) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60) {
            System.out.println("奖励环球影城一日游");
        } else {
            System.out.println("胖揍一顿");
        }*/
        if (score == 100) {
            System.out.println("奖励一辆跑车");
        } else if (score > 80) {
            System.out.println("奖励一辆山地自行车");
        } else if (score >= 60) {
            System.out.println("奖励环球影城一日游");
        }
    }
}
