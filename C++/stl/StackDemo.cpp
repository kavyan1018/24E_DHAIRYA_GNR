#include<iostream>
#include<stack>
#include<string>
using namespace std;



int main(){


    stack<string> names;
    names.push("John");
    names.push("Mary");
    names.push("Peter");
    names.push("Sally");
    names.push("Mike");

    cout<<names.top()<<endl;
    names.pop();
    cout<<names.top()<<endl;
    cout<<names.size()<<endl;
    
    while(!names.empty()){
        cout<<names.top()<<endl;
        names.pop();
    }





}