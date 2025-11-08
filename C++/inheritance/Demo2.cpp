#include<iostream>
using namespace std;

class Gov{

    public:
    int tax;
};
class State : public Gov{

    public:
    int grant;
    int getDa(){
        return tax;
    }
};

class Amc :public State{

public:
   int getData(){
       cout<<tax;
        return grant;
    }

};


int main()
{
 
}