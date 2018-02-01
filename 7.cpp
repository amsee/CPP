#include <iostream>
using namespace std;

void food(void);
void fish(void);

int main(void)
{
    food();
    fish();
    return 0;
}

void food(void)
{
    cout << "calling food" << endl;
}

void fish(void)
{
    cout << "calling fish" << endl;
}
