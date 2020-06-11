#include<iostream>
using namespace std;

int main()
{
    int a,b,c;
    int sum;
    int arrNum[10] = {0};
    cin >> a >> b >> c;
    sum = a * b * c;
    while(sum != 0)
    {
        arrNum[sum % 10]++;
        sum /= 10;
    }
    
    for(int i=0; i<10; ++i)
            cout<<arrNum[i]<<endl;
    return 0;
}