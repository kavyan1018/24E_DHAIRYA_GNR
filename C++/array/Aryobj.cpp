#include<iostream>
#include<string>
using namespace std;

class Students{

    int sRollNo;
    string sName;
    int sMarks;

    public:
    Students(){
        sRollNo = 0;
        sName = "";
        sMarks = 0;
    }

    bool addStudent();
    void getStudents();
    bool checklen(string);
};

bool Students::checklen(string s){
    if(s.length() > 5 || s.length() < 0 ){
        return false;
    }
    return true;
}

bool Students::addStudent(){

    cout<<"Enter Roll No: ";
    cin>>sRollNo;
    _flushall();
    cout<<"Enter Name: ";
    getline(cin,sName);
    _flushall();
    cout<<"Enter Marks: ";
    cin>>sMarks;

    bool flag = sRollNo  >0 && checklen(sName) && sMarks > 0 ? true : false;
    cout<<boolalpha<<"\n\n flag ="<<flag<<"\n\n";

    return flag;
}

void Students::getStudents(){

    cout<<"\n\nRoll No: "<<sRollNo;
    cout<<"\nName: "<<sName;
    cout<<"\nMarks: "<<sMarks;
}

int main(){

    Students s[3];
    for(int i=0;i<3;i++){

        if(s[i].addStudent()){
            cout<<"\n\nStudent Added Successfully\n\n";
        }
        else{
            cout<<"\n\nStudent Not Added\n\n";
        }
    }
    

    for(int i=0;i<3;i++){
        s[i].getStudents();
    }
   

}