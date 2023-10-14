package hw22;


    public class ValueCalculator {
        private double[] array;
        private final int size;

        public ValueCalculator(int size) {
            if (size < 1000000) {
                size = 1000000;
            }
            this.size = size;
            this.array = new double[size];
        }

        public int getSize() {
            return size;
        }

        public int getHalfSize() {
            return size / 2;
        }

        public void calculateValues() {
            long start = System.currentTimeMillis();

            for (int i = 0; i < size; i++) {
                array[i] = 1.0;
            }

            int half = size / 2;
            double[] a1 = new double[half];
            double[] a2 = new double[half];


            System.arraycopy(array, 0, a1, 0, half);
            System.arraycopy(array, half, a2, 0, half);


            Thread thread1 = new Thread(() -> {
                calculatePart(a1, 0);
            });

            Thread thread2 = new Thread(() -> {
                calculatePart(a2, half);
            });

            thread1.start();
            thread2.start();


            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.arraycopy(a1, 0, array, 0, half);
            System.arraycopy(a2, 0, array, half, half);

            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }

            long end = System.currentTimeMillis();
            long elapsedTimeMillis  = end - start;

            System.out.println("Execution time: " + elapsedTimeMillis  + " ms");

        }


        private void calculatePart(double[] part, int offset) {
            for (int i = 0; i < part.length; i++) {
                int index = offset + i;
                part[i] = (float)(array[index] * Math.sin(0.2f + index / 5) * Math.cos(0.2f + index / 5) * Math.cos(0.4f + index / 2));
            }
        }

    }

