#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
	int i;
	cin>>i;
	
	int q = i;
	int reminder = 0;
	int result =0;
	
	while(q != 0)
	{
		reminder = q%10;
		result = result*10 + reminder;
		q = q / 10;
	}
	
	if(result == i)
	{
		cout<<"Yes";
	}
	else
	{
		cout<<"No";
	}
}