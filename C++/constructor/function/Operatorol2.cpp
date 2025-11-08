#include<iostream>
using namespace std;

class Test{

    public:
    int a;
    Test(int x){
        a=x;
    }
    void operator+(Test &t){
        
        cout<<"\n + operator called...";
        cout<<"\n a = "<<t.a;

    }
    void print(){
        cout<<" \n print function a = "<<a<<endl;
    }

};
int main(){


    Test t1(10);
    Test t2(20);
    Test t3(50);
    t1+t2;
    t2+t3;

    t1.print();
}