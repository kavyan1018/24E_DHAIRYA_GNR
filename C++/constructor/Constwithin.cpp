//const is  special function which has same name as class name ,,const does not have return type
//but const can have parameter
//const can be used in class ,function ,variable
//use of constructor is to initialize the object,instance variable..
//ttype of construcor 3 type of construcor 1.default 2.parameterized 3.copy constructor

#include<iostream>
using namespace std;

class Parent{

    public:
    Parent(int x){
        cout<<"Parent constructor"<<endl;
    }
    Parent(){
        cout<<"Parent default constructor"<<endl;
    }
};
class Child : public Parent{

    public:
    Child(int x):Parent(1500){
        cout<<"Child constructor"<<endl;
    }
};


int main()
{


    Child c(10);

    return 0;

}