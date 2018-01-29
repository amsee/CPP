//import library using iostream
#include <iostream>
// import std library type
using namespace std;
// create main function using integer
int main(void)
// return integer
{
    // declare name with 10 spaces
    char name[15]; 
    cout << "Hello there, what is your name?: " << endl;
    cin >> name;

    cout << "Oh, hi there, " << name << endl;
    return 0;
}
