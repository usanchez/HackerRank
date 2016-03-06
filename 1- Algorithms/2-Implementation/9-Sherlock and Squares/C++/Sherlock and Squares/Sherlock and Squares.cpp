// Sherlock and Squares.cpp : Defines the entry point for the console application.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
	/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	int lines, a, b;
	cin >> lines;
	for (int i = 0; i<lines; i++) {
		cin >> a;
		cin >> b;
		int cont = 0;
		for (int n = (int)ceil(sqrt(a)); n <= (int)sqrt(b); n++) {
			cont++;
		}
		cout << cont << endl;
	}
	return 0;
}