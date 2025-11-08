//class template example

#include<iostream>
using namespace std;

template<class T,class S>
class Demo{

    public:
    void get(T a){

        cout<<"get function called...= "<<a<<endl;

    }
    void getdemo1(T a, S b){

        cout<<"getdemo1 function called...= "<<a<<" "<<b<<endl;

    }

};

int main(){


    Demo <char,int>d;
    d.get(97);
    d.getdemo1(97,98);
}