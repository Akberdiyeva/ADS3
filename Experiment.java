public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();
    public void runAllExperiments() {
        int[] sizes = {100, 1000, 5000, 10000};

        for (int size : sizes) {
            System.out.println("/nArray size: " + size);
            System.out.println("---RANDOM ARRAY---");
            int[] arr = sorter.generateRandomArray(size);

            long total1 = 0;
            for (int i = 0; i < 50; i++) {
                int[] copy = arr.clone();
                long start = System.nanoTime();
                sorter.basicSort(copy);
                long end = System.nanoTime();
                total1 += (end - start);
            }
            long avg1 = total1 / 50;

            long total2 = 0;
            for (int i = 0; i < 50; i++) {
                int[] copy = arr.clone();
                long start = System.nanoTime();
                sorter.advancedSort(copy);
                long end = System.nanoTime();
                total2 += (end - start);
            }
            long avg2 = total2 / 50;

            sorter.advancedSort(arr);
            int target = arr[size / 2];

            long total3 = 0;
            for (int i = 0; i < 50; i++) {
                long start = System.nanoTime();
                searcher.search(arr, target);
                long end = System.nanoTime();
                total3 += (end - start);
            }
            long avg3 = total3 / 50;

            System.out.println("Insertion sort: " + avg1);
            System.out.println("Quick sort: " + avg2);
            System.out.println("Binary search: " + avg3);
            System.out.println("---SORTED ARRAY---");
            int[] sortedArr = arr.clone();
            int targetSorted = sortedArr[size / 2];

            long totalS = 0;
            for (int i = 0; i < 50; i++) {
                long start = System.nanoTime();
                searcher.search(sortedArr, targetSorted);
                long end = System.nanoTime();
                totalS += (end - start);
            }
            long avgS = totalS / 50;
            System.out.println("Binary search (sorted): " + avgS);
        }
    }
}
