#include<iostream>
using namespace std;
#include<list>
#include<string>
#include<iterator>


int main(){

    list <string> students;
    //it will add data at end of the list...
    students.push_back("John");
    students.push_back("Mary");
    students.push_back("Peter");
    students.push_back("akshay");
    students.push_back("Amitabh");
    students.push_back("zara");

    students.push_back("Paul");
    students.push_front("raj");

    cout<<students[0]<<endl;
    //students.insert(students.begin(),"Daksh");
    list<string> :: iterator it;
    for(it=students.begin();it!=students.end();it++){
        cout<<*it<<endl;
    }
    cout<<"\n after inserting data::"<<endl;
    advance(it,3);
    students.insert(it,"Daksh");
    //iterate through the list

    students.remove("Paul");
    cout<<boolalpha<<students.empty();

    cout<<"\n front  = "<<students.front()<<endl;
    cout<<"\n back  = "<<students.back()<<endl;
    cout<<"\n size  = "<<students.size()<<endl;
    cout<<"\n max_size  = "<<students.max_size()<<endl;
    
    //students.clear();
    students.pop_front();
    students.pop_back();
     //students.reverse();
     students.sort();


    cout<<"\n reverse list = "<<endl;
    for(it=students.begin();it!=students.end();it++){
        cout<<*it<<endl;
    }

    
    

    
}