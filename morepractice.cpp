// Import library
#include <iostream>
using namespace std;
// Define Function
void triple(int n);
// Main Function
int main(void)
{
    // declare variable
    int number = 0;
    cout << "Number please: " << endl; // ask user for input
    cin >> number; // return an integer to user
    triple(number); // call function
    return 0;
}
// Declare Function
void triple(int n)
{
    cout << n * n * n;
}
