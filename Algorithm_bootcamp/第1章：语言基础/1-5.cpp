//输入一个学生的成绩score，判断是否及格
#include<iostream>
using namespace std;
int main(){
    float score;
    cin>>score;
    if(score>=60)
        cout<<"及格"<<endl;
    else
        cout<<"不及格"<<endl;
    return 0;
}