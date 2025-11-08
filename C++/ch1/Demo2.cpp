#include<iostream>

using namespace std;

class Vehicle{

        //by default private
        //labeled as public
        int x;
        public:
        void getData(){

            cout<<"\n enter value of x";
            cin>>x;
        }

        void printData();
};

//:: scope resolution opertor
void Vehicle :: printData(){

    cout<<"\n value of x = "<<x;
        
}


int main(){

    //class name  object name
    Vehicle v;
    v.getData();
    v.printData();

}