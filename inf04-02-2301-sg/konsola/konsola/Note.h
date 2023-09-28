#include <iostream>
#pragma once

class Note
{
public:
	Note(std::string title, std::string content);
	~Note();

	void display();

private:
	static int noteCount;
	int id;
	std::string title;
	std::string content;
};
