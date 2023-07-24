package HW7;

public class ArrayCalculator {
    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != 4) {
            throw new ArraySizeException("Array must be exact of 4x4 size");
        }
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Each row of the array must contain 4 elements, the "+i+ " row has less");
            }

            for (int j = 0; j < array[i].length; j++) {
                try {
                    arraySum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data at cell (" + i + ", " + j + ")");
                }
            }
        }
        return arraySum;
    }
}

