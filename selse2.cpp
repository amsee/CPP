//import library
#include <iostream>
using namespace std;
//define function
int triple (int n);
//main functiom
int main(void)
{
    // define variable
    int numba = 0;
    int result = 0;
    // ask user string
    cout << "Input #: " << endl;
    cin >> numba; // no parameters. integer output
    result = triple(numba); 
    cout << result << endl; // output result 
    return 0;

}
//declare function
//return function

int triple(int n)
{
    return n * n * n; 
}