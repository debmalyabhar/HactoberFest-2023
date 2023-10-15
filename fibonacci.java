#include <iostream>
using namespace std;

int main() {

    int n;
    cout << "Input fibonacci sequence length: ";
    cin >> n;

    int i = 1, fib0, fib1, fib2, sum = 0;
    fib0 = 0;
    fib1 = 1;
    fib2 = 1;

    do {
        i++;
        cout << fib0 << "  ";
        sum = sum + fib0;
        fib1 = fib2;
        fib2 = fib0;
        fib0 = fib1 + fib2;
    }
    while (i <= n);
    cout << endl << endl;
    cout << "Sum of numbers are: " << sum << endl;

    return 0;
}
