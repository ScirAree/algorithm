//输入3个整数，分别输出其增加1、扩大10倍、缩小100倍的结果
// <iomanip> 是 C++ 标准库中用于格式化输入输出的头文件，提供了许多用于格式化输出的函数和类型。
#include<iostream>
#include<iomanip>
using namespace std;
int main(){
    int n,a,b,c;
    cin>>n>>b>>c;
    a=++n;
    b*= 10;
    c/= 100;
    std::cout<<a<<setw(3)<<b<<setw(3)<<c<<endl;
    return 0;
}