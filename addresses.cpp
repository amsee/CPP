// import library
#include <iostream>
using namespace std;

// main function
int main(void)
{
    int user = 0;
    // Ask user for a number
    cout << "Put in a number... ";
    cin >> user;

    // guess how to make a for loop
    for(int i = 0; i < user; i++)
    {
        cout << " This is Number " << i + 1 << endl;
    }
}