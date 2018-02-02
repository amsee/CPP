#include <iostream>
using namespace std;

int isdigit(int n);

int main(void)
{
    int digits = 0;
    int result = 0;

    cout << "Input digits and I will do the rest" << endl;
    cin >> digits;
    result = isdigit(digits);
    cout << result << endl;

    return 0;
}

int isdigit(int n)
{
    return n * n;
}

