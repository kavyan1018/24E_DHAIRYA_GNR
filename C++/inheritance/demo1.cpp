#include<iostream>
using namespace std;

class Vehicle{

    public:
    char enname[20];
    char vehname[30];
    int makeyear;
};

class Car : public Vehicle{

    public:
    void getCar(){
        cout<<"\n enter car year";
        cin>>makeyear;
    }
    void printCarData(){

    cout<<"\n car year"<<makeyear;
    
    }

};
class Bike : public Vehicle{

    public:
    void getBikeData(){
        cout<<"\n enter car year";
        cin>>makeyear;
    }
    void printBikeData(){

    cout<<"\n car year"<<makeyear;
    
    }

};

int main(){


    Car c;
    c.getCar();
    c.printCarData();

    Bike b;
    b.getBikeData();
    b.printBikeData();

}