#include<iostream>
using namespace std;

class Bank{

public:

    int amount=1500; ///instance variable
    int x=150;

    void getAmount(int amount){ //local variable
        cout<<"amount ="<<this->amount<<endl;
        cout<<"x"<<this->x<<endl;
    }


};

int main(){

    Bank b;
    b.getAmount(100);
    
    return 0;
}