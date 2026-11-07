import java.util.Random;
import java.util.Scanner;

public class Monster {
    private String image = "\uD83E\uDDDF";
    private final int x, y;

    Monster(int sizeBoard) {
        Random random = new Random();
        x = 1 + random.nextInt(sizeBoard);
        y = 1 + random.nextInt(sizeBoard - 1);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public boolean conflictPerson(int personX, int personY) {
        return personX == x && personY == y;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");
        Random random = new Random();
        int a, b, trueAnswer;

        if (difficultGame == 1) {
            a = random.nextInt(50) + 1;
            b = random.nextInt(50) + 1;
            trueAnswer = a + b;
            System.out.println(a + " + " + b + " = ?");
        } else if (difficultGame == 2) {
            a = random.nextInt(10) + 1;
            b = random.nextInt(10) + 1;
            trueAnswer = a * b;
            System.out.println(a + " * " + b + " = ?");
        } else if (difficultGame == 3) {
            a = random.nextInt(20) + 1;
            b = random.nextInt(20) + 1;
            int c = random.nextInt(10) + 1;
            trueAnswer = a + b - c;
            System.out.println(a + " + " + b + " - " + c + " = ?");
        } else if (difficultGame == 4) {
            a = random.nextInt(15) + 1;
            b = random.nextInt(15) + 1;
            int c = random.nextInt(10) + 1;
            trueAnswer = a * b + c;
            System.out.println(a + " * " + b + " + " + c + " = ?");
        } else {
            a = random.nextInt(12) + 1;
            b = random.nextInt(12) + 1;
            int c = random.nextInt(12) + 1;
            trueAnswer = a * b * c;
            System.out.println(a + " * " + b + " * " + c + " = ?");
        }

        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        if (trueAnswer == answer) {
            System.out.println("Верно! Ты победил монстра");
            return true;
        } else {
            System.out.println("Неверно! Правильный ответ: " + trueAnswer + ". Ты проиграл эту битву!");
            return false;
        }
    }
}