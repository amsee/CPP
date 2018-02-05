#include <iostream>
using namespace std;

int main()
{
    // local variable initialization
    int person = 50;
    // output to user
    cout << "Here are your numbers: ";
    cin >> person;
    // execute for loop -> init, condition; increment
    while(person != 0)
    {
        person = person - 2;
        cout << person << endl;
    }

    return 0;

}
