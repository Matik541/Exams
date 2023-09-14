#include <iostream>

class Sort {
public:
	int* inputList = new int[10];
	/* ******************************
	 * function name: fillList()
	 * arguments: none
	 * return: none - fills the inputList with user input
	 * author: 00000000000
	 * ****************************** */
	void fillList() {
		for (int i = 0; i < 10; i++) {
			int temp = 0;

			try {
				std::cin >> temp;
				if (std::cin.fail()) {
					throw std::exception("Invalid input");
				}
				inputList[i] = temp;
				std::cout << "inputList[" << i << "] = " << inputList[i] << std::endl;
			}
			catch (std::exception e) {
				std::cout << e.what() << std::endl;
				std::cin.clear();
				std::cin.ignore(10000, '\n');
				i--;
			}
		}
	}
	/* ******************************
	 * function name: selcetSort()
	 * arguments: none
	 * return: none - sorts the inputList, 
		in descending order (highest to lowest)
		using selection sort
	 * author: 00000000000
	 * ****************************** */
	void selectSort()
	{
		for (int i = 0; i < 10; i++) {
			int max = findMax(i);
			int temp = inputList[i];
			inputList[i] = inputList[max];
			inputList[max] = temp;
		}
	}
private:
	/* ******************************
	 * function name: findMax()
	 * arguments: int start - the index to start searching from
	 * return: int - the index of the max value in the inputList
	 * author: 00000000000
	 * ****************************** */
	int findMax(int start) {
		int max = start;
		for (int i = start + 1; i < 10; i++) {
			if (inputList[i] > inputList[max]) {
				max = i;
			}
		}
		return max;
	}
};

int main()
{
	Sort sort;
	std::cout << "Input 10 numbers, next number is indicated by <enter>: " << std::endl;
	sort.fillList();

	std::cout << "Sorted list: " << std::endl;
	sort.selectSort();
	for (int i = 0; i < 10; i++) {
		std::cout << sort.inputList[i] << std::endl;
	}
}