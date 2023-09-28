#include <iostream>
#pragma once

class Note
{
public:
	Note(std::string title, std::string content) {
		if (!noteCount) {
			noteCount = 0;
		}
		this->title = title;
		this->content = content;
		this->id = noteCount++;
	}
	~Note() {
	}

	void display() {
		std::cout << "#" << id << ": " << title << "\n" << content << "\n\n";
	}

private:
	int noteCount;
	int id;
	std::string title;
	std::string content;
};

