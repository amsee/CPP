// OUTPUT
// Enter First Number:
// 10
// Enter Second Number:
// 01
// =========== BEFORE THE SWAP ===========
// a: 0x7ffee7bb6a48&b: b: 0x7ffee7bb6a44
// =========== ADDRESSES ===========
// &a = 0x7ffee7bb6a48&b = 0x7ffee7bb6a44
// ======== AFTER THE SWAP ========
// a: &a&b: 0x7ffee7bb6a44
//  ======== AFTER ADDRESS SWAP ========
// a = 0x7ffee7bb6a48b = 0x7ffee7bb6a44


// import library
#include <iostream>
using namespace std;

// swap values by reference
void swap(int &a, int &b);

// main function
int main()
{
  // define variable
  int a, b;

  // ask user for 2 numbers
  cout << "Enter First Number: " << endl;
  cin >> a;

  cout << "Enter Second Number: " << endl;
  cin >> b;

  // Show values before the Swap
  cout << "=========== BEFORE THE SWAP ===========" << endl;
  cout << "a: " << &a << "&b: " << "b: " << &b << endl;

  // show the addresses
  cout << "=========== ADDRESSES ===========" << endl;
  cout << "&a = " << &a << "&b = " << &b << endl;

  // pass the values into swap function
  swap(a, b);

  cout << "======== AFTER THE SWAP ========" << endl;
  cout << "a: " << "&a" << "&b: " << &b << endl;

  // swap addresses
  cout << " ======== AFTER ADDRESS SWAP ========" << endl;
  cout << "a = " << &a << "b = " << &b << endl;

  // return integer
  return 0;
}

// swap function
void swap(int &a, int &b)
{
  int temp = a;
  a = b;
  b = temp;
}
