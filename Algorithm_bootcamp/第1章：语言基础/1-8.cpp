//输入一个整数，判断其是否是水仙花数。水仙花数是指一个3位数，它的各位数字的3次幂之和等于它本身
#include<iostream>
using namespace std;
int main(){
    int num,a,b,c;
    cin>>num;
    a=num/100;
    b=(num/10)%10;
    c=num%10;
    if(num==a*a*a+b*b*b+c*c*c)
        cout<<"是水仙花数"<<endl;
    else
        cout<<"不是"<<endl;
    return 0;
}