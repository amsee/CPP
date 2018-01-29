//include library
#include <iostream>
//using std library type
using namespace std;
// create main function using int
int main(void)
// return integer
{
    // declaring variables 
    int turtles = 0;
    int nostrils = 0;
    int life = 0; 
    int feces = 0;

    // user questions
    cout << "How many turtles do you have?: " << endl;
    cin >> turtles; 

    cout << "How many nostrils do they have?: " << endl;
    cin >> nostrils;

    cout << "How many lives do they have left?: " << endl; 
    cin >> life;

    cout << "How many times a day does it take a washroom break?: " << endl;
    cin >> feces;
    
    return 0;
}
