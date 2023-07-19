#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n;
	cin>>n;
	
	int temp1=n,sum=0;
	
	while(n>0)
	{
		int i;
		i = n%10;
		sum = sum + (i*i*i);
		n = n/10;
	}
	
	if(temp1 == sum)
	{
		cout<<"Yes Armstrong number it is!";
	}
	else
	{
		cout<<"Not Armstrong number it is!";
	}
	
	return 0;
}