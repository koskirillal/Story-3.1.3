import java.util.Scanner;

public class Main{

    public static Chel manager;
    public static Lor story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out
                .println("Вы прошли собеседование и вот-вот станете сотрудником Корпорации. \n "
                        + "Осталось уладить формальности - подпись под договором (Введите ваше имя):");
        manager = new Chel(in.next());
        story = new Lor();
        while (true) {
            manager.A += story.this_lor.dA;
            if (manager.A < 0){
                manager.A = 0;
            }
            manager.K += story.this_lor.dK;
            if (manager.K < 0){
                manager.K = 0;
            }
            manager.R += story.this_lor.dR;
            if (manager.R < 0){
                manager.R = 0;
            }
            System.out.println("============="
                    + story.this_lor.subject + "==============");
            System.out.println(story.this_lor.text);
            System.out.println("\nКарьера:" + manager.K + "\tАктивы:"
                    + manager.A + "\tРепутация:" + manager.R + "\n=====");

            if (story.isEnd()) {
                System.out
                        .println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
    }
}