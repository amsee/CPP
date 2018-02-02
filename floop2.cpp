// import library
#include <iostream>
using namespace std;
// main function
int main()
// define variable 
{
    int user = 0;
// ask user input
    cout << "input number";
// cin
    cin >> user;
// for (init; condition; increment)
for (int i = user; i != user; i++) // (i is never less than user)
{
    cout << user << i + 1 << endl;
}
    return 0;
}
