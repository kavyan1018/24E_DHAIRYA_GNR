#include<iostream>
using namespace std;

//demo()
//local variable..
//instnace variable..
// 1 2 3 4 5

//static variable.. 
// what is static 
class StaticDemo{

    public:
    static int a;
    int x=100;
    const int p =15 ;

    static void demo(){

        cout<<a;
        
    }
    void demo2(){

        p = 15000;
    }

};

int StaticDemo::a = 10;
int main(){


        StaticDemo obj1;
        cout<<StaticDemo::a;
        cout<<obj1.x;
        obj1.demo();
        StaticDemo::demo();

        obj1.demo2();
    
        
        
        

}