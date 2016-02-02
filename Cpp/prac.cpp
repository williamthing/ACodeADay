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

        virtual bool addCourse(string s) = 0;
};

class Student : public Person {
    public:
        void aboutMe() {
            cout << "I am a student." << endl;
        }

        bool addCourse(string s) {
            cout << "adding course " << s << " to student." << endl;
            return true;
        }
};

int main() {
    Student * p = new Student();
    (*p).aboutMe();
    p->aboutMe();
    p->addCourse("Computer Science 101");
    delete p;
    return 0;
}



