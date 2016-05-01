#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int t;
    cin >> t;
    for(int a0 = 0; a0 < t; a0++){
        int n;
        int c;
        int m;
        cin >> n >> c >> m; // n dollars to buy, each chocolate c dollars, exchange m wrappers for 1 extra chocolate (and wrapper)
        int chocolates = n/c;
        int wrappers = chocolates;
        while(wrappers >= m) {
            chocolates += wrappers/m; 
            wrappers = wrappers/m + wrappers%m;
        }
        cout << chocolates << endl;
    }
    return 0;
}