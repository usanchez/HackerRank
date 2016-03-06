// ManasaAndStones.cpp : Defines the entry point for the console application.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	/* Enter your code here. Read input from STDIN. Print output to STDOUT */
	int cases = 0;
	cin >> cases;
	for (int i = 0; i < cases; i++) {
		int n, a, b; // number of stones, a-value, b-value
		cin >> n >> a >> b;
		n = n - 1;
		if (a == b)
			cout << a * n << endl;
		else {
			int min_step = min(a, b);
			b = max(a, b);

			// 1st alternative
			int value = min_step * n, max_value = b * n, diff = b - min_step;
			while (value <= max_value) {
				cout << value << ' ';
				value += diff;
			}

			// 2nd alternative for the 
			/*
			int a_stones = n, b_stones = 0, value;
			while (a_stones >= 0 && b_stones <= n) {
				value = a_stones * min_step + b_stones * b;
				cout << value << ' ';
				a_stones--;
				b_stones++;
			}
			*/
			cout << endl;		
		}
		
	}
	return 0;
}