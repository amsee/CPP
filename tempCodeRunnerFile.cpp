// Import Library
#include <iostream>
using namespace std;

// Define function
int quadruple(int n);

// Main function
int main(void)
{
    // Define variable
    int digit = 0;
    int result = 0;

    // Ask for user output
    cout << "Please enter a digit: " << endl;
    // Take user input
    cin >> digit;
    // Call function
    result = quadruple(digit);
    cout << result << endl;
    
    return 0;
}

int quadruple(int n)
{
    // Calculations
    cout << n * n * n;
}


