// Import Library
#include <iostream>
using namespace std;

// define function
char flowers(char);

// main function
int main(void)
{
    //  define variables 
    char colour = 0;
    char result = 0;

    // user output
    cout << "What is your favourite colour?" << endl;
    // user input
    cin >> colour;
    result = flowers(colour);
    cout << result << endl;

    return 0; 
}

char flower(char)
{
    cout << "So if you were a flower" << endl;
}
