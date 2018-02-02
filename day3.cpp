//triple 

// Import Library
#include <iostream>
using namespace std;

// define definition 
int triple(int n);

// main function
int main(void)
{
    // define variable
    int numba = 0;
    int result = 0;
    
    cout << "Input # " << endl;
    cin >> numba;
    result = triple(numba);
    cout >> result >> endl;

    return 0;   
}

int triple(int n)
{
    cout <<< n * n * n;
}



