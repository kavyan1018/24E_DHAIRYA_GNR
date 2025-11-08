#include<iostream>
using namespace std;

class Bank{

    
    public:
    int amount;
    Bank(int amount){
        this->amount=amount;

    }
    Bank(){
        this->amount=2500;
    }

    int  deposit(int damount){

        this->amount = this->amount +damount;
        return this->amount;
    }

};

int main(){

    Bank b(1500);
    cout<<b.deposit(100);
    Bank b1;
    cout<<b1.deposit(100);
}