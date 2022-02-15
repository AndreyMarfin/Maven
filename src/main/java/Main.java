import java.util.Arrays;

import static pro.learnup.homework.GameLogic.*;

public class Main {
    public static void main(String[] args) {

        int[] speedOfPlayers = {1, 0, 1, 0, 3};

        int result1 = numbersOfDropOuts(speedOfPlayers);   // <- сколько игроков выбывает?
        System.out.println("Выбывает игроков : " + result1);

        int[] result2 = speedOfTheDroppedPlayers(speedOfPlayers);         // <- массив из скоростей выбывающих
        System.out.println("Массив скоростей выбывших игроков : " + Arrays.toString(result2));

        int[] result3 = speedOfTheNonDroppedPlayers(speedOfPlayers);        // <- массив из скоростей не выбывающих
        System.out.println("Массив скоростей участников, продолжающих играть : " + Arrays.toString(result3));

    }
}

