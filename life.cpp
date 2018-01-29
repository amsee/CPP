#include <iostream>
using namespace std;
int main(void)
{
    char month[100];
    char day[100]; 
    char year[100];
    char name[100];
    
    cout << "What month were you born in?: ";
    cin >> month;

    cout << "What day were you born?: ";
    cin >> day;

    cout << "What year were you born in?: ";
    cin >> year;
 
    cout << "What is your name?: ";
    cin >> name;

    cout << "Hello " << name << ". So, you were born on the " << day << " of " << month << " in the year, " << year << "!!! " << endl;
    
    return 0;
}