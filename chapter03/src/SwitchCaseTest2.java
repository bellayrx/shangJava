import java.util.Scanner;

/**
 * 编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
 * - 结论：凡是使用switch-case的结构都可以转换为if-else结构。反之，不成立。
 * - 开发经验：如果既可以使用switch-case，又可以使用if-else，建议使用switch-case。因为效率稍高。
 * - 细节对比：
 * - if-else语句优势
 * - if语句的条件是一个布尔类型值，if条件表达式为true则进入分支，可以用于范围的判断，也可以用于等值的判断，`使用范围更广`。
 * - switch语句的条件是一个常量值（byte,short,int,char,枚举,String），只能判断某个变量或表达式的结果是否等于某个常量值，`使用场景较狭窄`。
 * - switch语句优势
 * - 当条件是判断某个变量或表达式是否等于某个固定的常量值时，使用if和switch都可以，习惯上使用switch更多。因为`效率稍高`。当条件是区间范围的判断时，只能使用if语句。
 * - 使用switch可以利用`穿透性`，同时执行多个分支，而if...else没有穿透性。
 */
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2023年的月份");
        int month = scanner.nextInt();
        System.out.println("请输入2023年的天数");
        int day = scanner.nextInt();
        scanner.close();
        //假设用户输入合法，后面我们用正则表达式判断是否正确
        int sumDays = 0;
        //方式一：存在数据冗余
        /*switch (month) {
            case 1:
                sumDays = day;
                break;
            case 2:
                sumDays = 31 + day;
                break;
            case 3:
                sumDays = 31 + 28 + day;
                break;
            case 4:
                sumDays = 31 + 28 + 31 + day;
                break;
            case 5:
                sumDays = 31 + day;
                break;
            case 6:
                sumDays = 31 + 28 + day;
                break;
            case 7:
                sumDays = day;
                break;
            case 8:
                sumDays = 31 + day;
                break;
            case 9:
                sumDays = 31 + 28 + day;
                break;
            case 10:
                sumDays = day;
                break;
            case 11:
                sumDays = 31 + day;
                break;
            case 12:
                sumDays = 31 + 28 + day;
                break;
        }*/
        //方式二：倒着写
        //写法2：推荐
        switch (month) {
            case 12:
                sumDays += 30;//这个30是代表11月份的满月天数
            case 11:
                sumDays += 31;//这个31是代表10月份的满月天数
            case 10:
                sumDays += 30;//这个30是代表9月份的满月天数
            case 9:
                sumDays += 31;//这个31是代表8月份的满月天数
            case 8:
                sumDays += 31;//这个31是代表7月份的满月天数
            case 7:
                sumDays += 30;//这个30是代表6月份的满月天数
            case 6:
                sumDays += 31;//这个31是代表5月份的满月天数
            case 5:
                sumDays += 30;//这个30是代表4月份的满月天数
            case 4:
                sumDays += 31;//这个31是代表3月份的满月天数
            case 3:
                sumDays += 28;//这个28是代表2月份的满月天数
            case 2:
                sumDays += 31;//这个31是代表1月份的满月天数
            case 1:
                sumDays += day;//这个day是代表当月的第几天
        }
        System.out.println("2023年的" + month + "月" + day + "日" + "是第" + sumDays + "天");

    }
}
