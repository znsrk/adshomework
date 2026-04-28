This is a simple Java project that compares insertion sort, merge sort, and binary search using banking balance data. It measures runtime with different array sizes and input types to show how performance changes. The results are printed in the console.

Sorter.java implements insertion sort as the basic algorithm and merge sort as the advanced one, plus array generation and printing. I chose insertion sort because it is simple and shows clear performance differences on sorted versus random data, and merge sort because it scales well for larger inputs.
Searcher.java implements binary search for fast lookups on sorted arrays. Experiment.java runs the timing tests with nanoTime and prints the results. Main.java wires everything together and starts the experiments.
.gitignore keeps build outputs out of the repo, and the docs folders are for screenshots and results.
<img width="1312" height="914" alt="Screenshot 2026-04-28 184610" src="https://github.com/user-attachments/assets/3728a307-d511-459e-a47b-83894185eed4" />
<img width="1400" height="932" alt="Screenshot 2026-04-28 184616" src="https://github.com/user-attachments/assets/c24c2d82-57ab-4067-a03a-136ad9b260f6" />
Screenshots show two test runs I did
