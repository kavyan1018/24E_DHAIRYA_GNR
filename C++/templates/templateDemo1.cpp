#include<iostream>
using namespace std;

int sum(int a,int b){

    cout<<"value of a = "<<a<<endl;
    cout<<"value of b = "<<b<<endl;

    return a+b;
}

int main(){

    int a,b;
    cout<<"Enter the value of a and b : ";
    cin>>a>>b;

    

    sum(a,b);

}