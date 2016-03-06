// ServiceLane.cpp : Defines the entry point for the console application.
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int largest_vehicle_type_for_width_interval(vector<int> width, int start_segment, int end_segment) {
	int largest_vehicle = 3;
	for (int width_i = start_segment; width_i <= end_segment; width_i++) {
		largest_vehicle = width[width_i] < largest_vehicle ? width[width_i] : largest_vehicle;
	}
	return largest_vehicle;
}

int main() {
	int n; // number of segments
	int t; // number of cases
	cin >> n >> t;
	vector<int> width(n);
	for (int width_i = 0; width_i < n; width_i++) {
		cin >> width[width_i];
	}
	for (int a0 = 0; a0 < t; a0++) {
		int i; // starting segment
		int j; // ending segment
		cin >> i >> j;
		cout << largest_vehicle_type_for_width_interval(width, i, j) << endl;
	}
	return 0;
}