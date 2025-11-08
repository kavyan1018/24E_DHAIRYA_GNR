#include<iostream>
#include<string>
using namespace std;

int main(){

    string name = "Raj";

    cout<<"\n enter name";
    //getline
    //length
    //push_back(char):void
    getline(cin,name);
    cout<<"\n name = "<<name;
    int len = name.length();
    cout<<"\n len = "<<len;

    name.push_back('#');
    int x = name.size();
    cout<<"\n x = "<<x;
    cout<<"\n name = "<<name;
    name.pop_back();
    cout<<"\n name = "<<name;

    string str = name.substr(0,5);
    cout<<"\n sub string = "<<str;

    string str2 = name.insert(0,"***");
    cout<<"\n str2 = "<<str2;
    string str3 = name.insert(0,2,'*');
    cout<<"\n str3 = "<<str3;

    name.erase(0,5);
    cout<<"after erase...";
    cout<<"\n name = "<<name;

    //name.erase(1);
    cout<<"after erase...";
    cout<<"\n name = "<<name;

    name.at(0) = '$';
    name[0] = '$';

      cout<<name.find("raj");

      string lk = name.append("raj");
        cout<<"\n lk = "<<lk;
     
     string name1 = "jaya";
    name1.replace(0,3,"raj");
    cout<<"name1 ="<<name1;



}