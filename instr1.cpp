#include <iostream>
using namespace std;

int getInstrument(int);

int main(void)
{
    // Create a variable to put the user's choice in
    int option = 0;
    int result = 0;
    cout << " ============================ " << endl;
    cout << " 1 - Piano" << endl;
    cout << " 2 - Guitar" << endl;
    cout << " 3 - Flugelhorn" << endl;

    // cin >> 'complete this'
    cin >> option;

    // result = getInstrument() complete this too
    result = getInstrument(option);

    // cout << "The user's choice is: " << 'add the user's choice variable'
    cout << "The user's choice is: " << option << endl;
}

int getInstrument(int n)
{
    return n;
}

