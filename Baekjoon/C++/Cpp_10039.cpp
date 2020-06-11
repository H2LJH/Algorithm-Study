#include <iostream>

using namespace std;

int main()
{
	int num[5];
    int sum;
    int avg;
	for(int i=0; i<5; ++i)
    {
        cin >> num[i];
    
	    if(num[i] < 40)
    		num[i] = 40;
	}
    
    for(int i=0; i<5; ++i)
    {
	    sum += num[i];
        if(i==5-1)
            avg = sum / 5;
    }
    
	cout<<avg<<endl;
	return 0;
}