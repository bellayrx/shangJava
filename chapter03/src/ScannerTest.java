import java.util.Scanner;

/**
 * 使用Scanner：
 * 1.导包
 * 2.创建Scanner的实例
 * 3.调用Scanner类中的方法
 * 4.避免泄露，关闭资源，调用close的方法
 * <p>
 * <p>
 * 小明注册某交友网站，要求录入个人相关信息。如下：
 * <p>
 * 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎光临你来我往交友网");
        System.out.println("请输入你的网名");
        String name = scanner.next();//阻塞式
        System.out.println("请输入您的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入您的体重");
        double weight = scanner.nextDouble();
        System.out.println("您是否单身，单身true，不单身：false");
        boolean isSingle = scanner.nextBoolean();
        System.out.println("请输入您的性别");
        char gender = scanner.next().charAt(0);
        System.out.println("网名:" + name + "年龄:" + age + "体重:" + weight + "是否单身:" + isSingle + "性别:" + gender);
        System.out.println("注册完成，欢迎继续进入体验");
        scanner.close();//你不写这个，gc不会给你回收的。
    }
}
