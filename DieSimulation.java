public class DieSimulation {
    static float[] randArr;

    public DieSimulation() {
        randArr = new float[1000];
    }

    public static int relIntegerNumber(float randArr) {
        int number = 0;
        if (randArr >= 0.0 / 6 && randArr < 1.0 / 6) {
            number = 1;
        }
        if (randArr >= 1.0 / 6 && randArr < 2.0 / 6) {
            number = 2;
        }
        if (randArr >= 2.0 / 6 && randArr < 3.0 / 6) {
            number = 3;
        }
        if (randArr >= 3.0 / 6 && randArr < 4.0 / 6) {
            number = 4;
        }
        if (randArr >= 4.0 / 6 && randArr < 5.0 / 6) {
            number = 5;
        }
        if (randArr >= 5.0 / 6 && randArr < 6.0 / 6) {
            number = 6;
        }

        return number;
    }
}
