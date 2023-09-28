#include <iostream>
#include <time.h>

void bubbleSort(int* &arrayToSort, int size) {
	for (int i = 0; i < size; i++)
	{	
		for (int j = 0; j < size; j++)
		{
			if ( arrayToSort[j] > arrayToSort[i])
			{
				int temp = arrayToSort[i];
				arrayToSort[i] = arrayToSort[j];
				arrayToSort[j] = temp;
			}
		}
	}
}

void printArray(int* arrayToDispaly, int size) {
	for (int i = 0; i < size; i++)
	{
		std::cout << arrayToDispaly[i] << ", ";
	}
	std::cout << std::endl;
}

int main()
{
	srand(time(NULL));
	
	int size = 100;
	int* randomArray = new int[size];
	
	for (int i = 0; i < size; i++)
	{
		randomArray[i] = rand() % 1001;
	}

	printArray(randomArray, size);
	bubbleSort(randomArray, size);
	printArray(randomArray, size);
	
}