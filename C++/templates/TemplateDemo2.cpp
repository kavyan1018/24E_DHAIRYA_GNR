#include<iostream>
using namespace std;

//2 type of template are there 
//1. template function
//2. template class

//function tamplate --> typename T
template<typename T,typename S> T add(T a,S b,S c){

    cout<<"value of a = "<<a<<endl;
    cout<<"value of b = "<<b<<endl;

    //return a+b;
}


int main(){

    add(100,'b','l');

}
