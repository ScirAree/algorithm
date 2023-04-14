


//输入圆的半径r，输出其周长和面积

#include<iostream>
using namespace std;
int main(){
    const double PI = 3.14159;
    double r,c,s;
    cout<<"输入圆的半径：";
    cin>>r;
    c = PI * 2* r;
    s = PI*r*r;
    cout<<"圆的周长："<<c<<endl;
    cout<<"圆的面积："<<s<<endl;
    return 0;

}