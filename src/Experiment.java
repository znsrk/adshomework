public class Experiment {
    private final Sorter sorter;
    private final Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();
        long start = System.nanoTime();
        if ("basic".equalsIgnoreCase(type)) {
            sorter.basicSort(copy);
        } else if ("advanced".equalsIgnoreCase(type)) {
            sorter.advancedSort(copy);
        }
        long end = System.nanoTime();
        return end - start;
    }

    public long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();
        return end - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};
        String[] inputTypes = {"random", "sorted"};

        for (int size : sizes) {
            System.out.println("\n--- Size: " + size + " ---");
            int[] randomArr = sorter.generateRandomArray(size);

            for (String inputType : inputTypes) {
                int[] arr;
                if ("random".equals(inputType)) {
                    arr = randomArr.clone();
                } else {
                    arr = randomArr.clone();
                    sorter.advancedSort(arr);
                }

                long basicTime = measureSortTime(arr, "basic");
                long advancedTime = measureSortTime(arr, "advanced");

                int[] sortedForSearch = arr.clone();
                sorter.advancedSort(sortedForSearch);
                int target = sortedForSearch[sortedForSearch.length / 2];
                long searchTime = measureSearchTime(sortedForSearch, target);

                System.out.println("Input: " + inputType);
                System.out.println("Basic sort time (ns): " + basicTime);
                System.out.println("Advanced sort time (ns): " + advancedTime);
                System.out.println("Binary search time (ns): " + searchTime);
            }
        }
    }
}
