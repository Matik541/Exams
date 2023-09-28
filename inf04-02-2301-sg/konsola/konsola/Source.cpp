#include <iostream>
#include <string>

class Note {    
private:
    static int noteCount;
    int id;
    
protected: 
    std::string title;
    std::string content;

public:
    void display() {
        std::cout << std::endl 
            << "Tytul: " << title << std::endl 
            << "Tresc: " << content << std::endl;
    }
    void diagnostic() {
        std::cout << std::endl 
            << id << ";" << title << ";" << content << std::endl;
    }
    
    Note(std::string title, std::string content) {
		this->title = title;
		this->content = content;
        id = noteCount++;
    }

};
// !!!! WA¯NE !!!!
int Note::noteCount = 0;


int main() {
    Note preset("Note preset", "Content preset");

    preset.display();
	preset.diagnostic();
    

	std::string title, content;

	std::cout << "Podaj tytul i tresc notatki\nTytul: ";
	std::cin >> title;
	std::cout << "Tresc: ";
	std::cin >> content;

	Note inputed(title, content);
    
    inputed.display();
	inputed.diagnostic();
    
    return 0;
}
