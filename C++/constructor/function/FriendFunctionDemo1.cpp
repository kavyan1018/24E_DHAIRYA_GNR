#include<iostream>
using namespace std;

class Home{
    public:
    int time=10;
    void entry();
    friend void newEntry();

    Home(){
        cout<<"Home constructor"<<endl;
    }

};
class Neighbour{
    public:
    int time=20;
    void entry();
    friend void newEntry();

    Neighbour(){
        cout<<"Neighbour constructor"<<endl;
    }

};

void Home::entry(){

    cout<<"Entry"<<endl;
    cout<<"Time:"<<time<<endl;
}

void newEntry(Home &h,Neighbour &n){
    //cout<<"New Entry";
    //Home h;
    //Neighbour n;
    Home h1;
    cout<<"h address in friend"<<&h<<endl;
    cout<<"n address in friend"<<&n<<endl;

    cout<<"Home time = "<<h.time<<endl;
    cout<<"Neighbour time = "<<n.time<<endl;
}

int main(){


    Home h;
    Neighbour n;

    cout<<"h address in main"<<&h<<endl;
    cout<<"n address in main"<<&n<<endl;

    h.entry();
    newEntry(h,n);
    return 0;

}