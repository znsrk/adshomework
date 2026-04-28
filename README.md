This is a simple Java project that compares insertion sort, merge sort, and binary search using banking balance data. It measures runtime with different array sizes and input types to show how performance changes. The results are printed in the console.

Sorter.java implements insertion sort as the basic algorithm and merge sort as the advanced one, plus array generation and printing. I chose insertion sort because it is simple and shows clear performance differences on sorted versus random data, and merge sort because it scales well for larger inputs.
Searcher.java implements binary search for fast lookups on sorted arrays. Experiment.java runs the timing tests with nanoTime and prints the results. Main.java wires everything together and starts the experiments.
.gitignore keeps build outputs out of the repo, and the docs folders are for screenshots and results.
