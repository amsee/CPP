// Import library as usual
#include <iostream> 
using namespace std;
// Define Function
void square(int n); // Returns nothing. Function called square takes an integer as input by user.
// Create Main Function
int main(void) // Returns an integer and always takes nothing as parameters.
{
    int number = 0; // Define Variable called number and takes number by user.
    cout << "Gimme a number: "; //"Give me user // Ask user for an int using a string.
    cin >> number; // If user inputs a number, then returns an integer after user input. (do not use string).
    // next, go to line 16 and create a function that does calculations.
    square(number);
    return 0;
}
// Declare Function
void square(int n)
{
    // do da calculations
    cout << n * n << endl; 
}
    // finally finished :'(