package binarySearch;


public class BinarySearch {

    private int[] mas;

    public BinarySearch(int[] mas) {
        this.mas = mas;
    }


    public int findIndex(int targetValue) {
        int minIndex = 0;
        int maxIndex = mas.length - 1;
        int centerIndex = mas.length / 2;

        if (targetValue == mas[centerIndex]) {
            return centerIndex;
        } else if (targetValue == mas[maxIndex]) {
            return maxIndex;
        } else if (targetValue == mas[minIndex]) {
            return minIndex;
        }

        while (targetValue != mas[centerIndex]) {
            if (targetValue > mas[centerIndex]) {
                if (targetValue > mas[minIndex] && targetValue > mas[maxIndex]) {
                    if (mas[minIndex] > mas[centerIndex]) {
                        maxIndex = centerIndex;
                    } else {
                        minIndex = centerIndex;
                    }
                } else if (targetValue < mas[maxIndex] && targetValue < mas[minIndex]) {
                    if (mas[minIndex] > mas[centerIndex]) {
                        minIndex = centerIndex;
                    } else {
                        maxIndex = centerIndex;
                    }
                } else if (targetValue < mas[maxIndex] && targetValue > mas[minIndex]) {
                        minIndex = centerIndex;
                }
            } else {
                if (targetValue > mas[maxIndex] && targetValue > mas[minIndex]) {
                    maxIndex = centerIndex;
                } else if (targetValue < mas[maxIndex] && targetValue < mas[minIndex]) {
                    if (mas[minIndex] > mas[centerIndex]){
                        maxIndex = centerIndex;
                    } else {
                        minIndex = centerIndex;
                    }
                }
                else if (targetValue < mas[maxIndex] && targetValue > mas[minIndex]) {
                    maxIndex = centerIndex;
                }
            }
            centerIndex = (maxIndex + minIndex) / 2;
        }
        return centerIndex;
    }
}

