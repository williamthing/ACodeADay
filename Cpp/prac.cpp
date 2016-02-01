#include <iostream>
using namespace std;

#define NAME_SIZE 50

class Person {
    int id;
    char name[NAME_SIZE];

public:
    void aboutMe() {
        cout << "I am a person." << endl;
    }
};

class Student : public Person {
    public:
        void aboutMe() {
            cout << "I am a student." << endl;
        }
};

int main() {
    Student * p = new Student();
    (*p).aboutMe();
    p->aboutMe();
    delete p;
    return 0;
}



