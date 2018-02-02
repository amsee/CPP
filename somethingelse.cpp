// Import library
#include <iostream>
using namespace std;
// Define Function
int triple(int n);
// Main Function
int main(void)
{
    // declare variable
    int number = 0;
    int result = 0;
    cout << "Number please: " << endl; // ask user for input
    cin >> number; // return an integer to user
    result = triple(number); // call function
    cout << result << endl;
    return 0; 
}
// Declare Function
int triple(int n)
{
    return n * n * n;
}


