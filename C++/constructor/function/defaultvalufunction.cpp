#include<iostream>
using namespace std;
class Calc{


    public:
    int add(int a=0,int b=0,int c=0){

        return a+b+c;
    }
};

int main(){


    Calc c;
    cout<<"Addition = "<<c.add(10,15,25)<<endl;

    return 0;
}