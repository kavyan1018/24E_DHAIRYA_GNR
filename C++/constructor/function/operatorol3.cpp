#include<iostream>
using namespace std;

class Data{

public:
    int a;
    Data(int x)
    {
        a=x;
    }


    bool operator==(Data &d){
        //20
        cout<<"\n a = "<<a;
        cout<<"\n d.a = "<<d.a;
        if(a==d.a)
            return true;
        else
            return false;
    }


};

int main(){

    Data d1(10);
    Data d2(20);
    

    if(d1==d2)
        cout<<"\n d1 and d2 are equal";
    else
        cout<<"\n d1 and d2 are not equal";
}