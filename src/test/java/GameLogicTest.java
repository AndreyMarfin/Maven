import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.learnup.homework.GameLogic;

public class GameLogicTest {

    // Секция numberOfDropOutsTest <- принято сокращение numDrop

    // Секция numDropGreenLight

    @Test
    public void numDropGreenLightSpeedZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -2, -5, -5, -1};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 2, 3, 4, 55};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, -2, -15, 0, -55};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 2, 15, 0, 55};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-5, 2, -15, 6, 55};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropGreenLightSpeedArrayMixNegativePositiveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-5, 2, 0, 6, 55};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция numDropRedLight

    @Test
    public void numDropRedLightArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -5, -6, -1, -1};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void numDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 2, 3, 4, 5};
        int expected = 3; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, -2, 0, -4, -5};
        int expected = 0; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 2, 0, 4, 5};
        int expected = 2; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixNegativePositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-2, 2, -55, 4, 5};
        int expected = 2; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numDropRedLightSpeedArrayMixZerosPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 2, 0, -4, 5};
        int expected = 1; // ОР
        int actual = GameLogic.numbersOfDropOuts(speedOfPlayers); //ФР
        Assertions.assertEquals(expected, actual);
    }

    // Секция speedOfTheDroppedPlayers <- принято сокращение speedDrop

    // Секция speedDropGreenLight

    @Test
    public void speedDropGreenLightSpeedArraySpeedZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -52, -4, -5, -1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 52, 4, 5, 1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, 0, 0, -5, -1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 52, 0, 0, 1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 52, -4, -5, -1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropGreenLightSpeedArrayZerosNegativePositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, 0, 4, -5, 1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedDropRedLight

    @Test
    public void speedDropRedLightSpeedArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -5, -4, -51, -1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 13, 4, 51, 125};
        int[] expected = {13, 4, 51, 125}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, 0, 0, -51, -1};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 0, 4, 51, 0};
        int[] expected = {4, 51}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 51, -4, -51, -1};
        int[] expected = {51}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedDropRedLightSpeedArrayZerosNegativePositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, 0, 2, 51, -1};
        int[] expected = {51}; // ОР
        int[] actual = GameLogic.speedOfTheDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedOfTheNonDroppedPlayers <- принято сокращение speedNonDrop

    // Секция speedNonDropGreenLight

    @Test
    public void speedNonDropGreenLightSpeedArrayZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -5, -85, -7, -75};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 5, 85, 7, 75};
        int[] expected = {1, 5, 85, 7, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, -5, -85, 0, -75};
        int[] expected = {0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 5, 85, 0, 75};
        int[] expected = {0, 5, 85, 0, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-5, 5, 85, -78, 75};
        int[] expected = {5, 85, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropGreenLightSpeedArrayZerosPositiveNegative() {
        GameLogic.isGreenLight = true;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 5, 0, -78, 75};
        int[] expected = {0, 5, 0, 75}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    // Секция speedNonDropRedLight

    @Test
    public void speedNonDropRedLightSpeedArrayZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayBelowZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-1, -5, -85, -7, -75};
        int[] expected = {}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayAboveZeros() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {1, 5, 85, 7, 75};
        int[] expected = {1}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, -5, -85, 0, -75};
        int[] expected = {0, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositive() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 2, 85, 0, 75};
        int[] expected = {0, 2, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {-5, 2, 85, -78, 75};
        int[] expected = {2}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void speedNonDropRedLightSpeedArrayZerosPositiveNegative() {
        GameLogic.isGreenLight = false;
        GameLogic.maxSpeed = 2;
        int[] speedOfPlayers = {0, 1, 0, -78, 75};
        int[] expected = {0, 1, 0}; // ОР
        int[] actual = GameLogic.speedOfTheNonDroppedPlayers(speedOfPlayers); //ФР
        Assertions.assertArrayEquals(expected, actual);
    }
}
