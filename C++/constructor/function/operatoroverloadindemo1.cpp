#include<iostream>
using namespace std;

//many of function
// + , - * / % , ++ , -- , += , -= , *= , /= , %= , << , >> , & , | , ^ , && , || , ! , ~ , == , != , > , < , >= , <= , =
//2 type of operator
//unery opertor binary operator
// ++ --  ++a --a  a++ a--
// + - * /  a + b  a - b  a * b  a / b  a % b

class Test{

    public:

    int x;

    void operator ++(){

        cout<<"++ opertor funtion called..."<<endl;
        //operation is up to you...
    }



};

int main(){

    Test t1;
    cout<<"t1.x = "<<&t1<<endl;
    ++t1;
    cout<<"t1.x = "<<&t1<<endl;


}