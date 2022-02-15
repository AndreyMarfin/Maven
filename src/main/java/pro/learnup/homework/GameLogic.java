package pro.learnup.homework;

public class GameLogic {
    public static boolean isGreenLight = false;
    public static int maxSpeed = 2;

    public static int numbersOfDropOuts(int[] speedOfPlayers) {
        int response = 0;
        if (isGreenLight) {
            response = 0;
        } else {
            for (int speedOfPlayer : speedOfPlayers) {
                if (speedOfPlayer > maxSpeed) {
                    response++;
                }
            }
        }
        return response;
    }

    public static int[] speedOfTheDroppedPlayers(int[] speedOfPlayers) {

        int cnt = numbersOfDropOuts(speedOfPlayers);
        int[] response = new int[cnt];
        int i = 0;
        for (int speedOfPlayer : speedOfPlayers) {
            if (isGreenLight) {
                continue;
            } else {
                if (speedOfPlayer > maxSpeed) {
                    response[i] = speedOfPlayer;
                    i++;
                }
            }
        }
        return response;
    }

    public static int[] speedOfTheNonDroppedPlayers(int[] speedOfPlayers) {

        int cnt = 0;
        for (int speedOfPlayer : speedOfPlayers) {
            if (isGreenLight) {
                if (speedOfPlayer >= 0) {
                    cnt++;
                }
            } else {
                if (speedOfPlayer > maxSpeed) {
                    continue;
                } else {
                    if (speedOfPlayer <= maxSpeed) {
                        if (speedOfPlayer >= 0) {
                            cnt++;
                        }
                    }
                }
            }
        }

        int[] response = new int[cnt];
        int i = 0;
        for (int speedOfPlayer : speedOfPlayers) {
            if (isGreenLight) {
                if (speedOfPlayer >= 0) {
                    response[i] = speedOfPlayer;
                    i++;
                }
            } else {
                if (speedOfPlayer > maxSpeed) {
                    continue;
                } else {
                    if (speedOfPlayer >= 0) {
                        if (speedOfPlayer <= maxSpeed) {
                            response[i] = speedOfPlayer;
                            i++;
                        }
                    }
                }
            }
        }
        return response;
    }
}
