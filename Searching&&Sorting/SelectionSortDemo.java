package SearchingandSorting;

public class SelectionSortDemo
{
    public static void main(String[] args)
    {
        int[] list = {45, 12, 88, 3, 19, 5, 72, 1, 30, 16};

        System.out.println("Original list:");
        printArray(list);

        selectionSort(list, list.length);

        System.out.println("\nSorted list:");
        printArray(list);
    }

    // ------------------------------------------------------
    // GIVEN METHOD (Not modified)
    // ------------------------------------------------------
    public static void selectionSort(int[] list, int listLength)
    {
        int index;
        int smallestIndex;
        int minIndex;
        int temp;

        for (index = 0; index < listLength - 1; index++)
        {
            smallestIndex = index;

            for (minIndex = index + 1;minIndex < listLength; minIndex++)
            {
                if (list[minIndex] < list[smallestIndex])
                    smallestIndex = minIndex;
            }

            // Swap list[index] and list[smallestIndex]
            temp = list[smallestIndex];
            list[smallestIndex] = list[index];
            list[index] = temp;
        }
    }

    // ------------------------------------------------------
    // Helper method to print the array
    // ------------------------------------------------------
    public static void printArray(int[] list)
    {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
