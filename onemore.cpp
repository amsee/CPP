#include <iostream>
using namespace std;

// FUNCTION DEFINITION 
// ADD SEMICOLON FOR FUNCTION DEFINTIONS

void littleone(void);
void bigone(void);

// create main function

int main(void)
{
    littleone();
    return 0;
}

// FUNCTION DECLARATIONS 
// DECLARING THE BODY OF THE FUNCTION

void littleone(void)
{
    bigone();
    cout << "My little friend beside me has a big brain." << endl;
}

void bigone(void)
{
    cout << "This brain of mine isn't very big. But, I do have a big stomache." << endl;
}