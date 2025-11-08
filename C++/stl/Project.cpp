#include<iostream>
#include<map>
#include<string>
#include<list>

using namespace std;



list<string> dmeo(){

    list<string> l;
    l.push_back("seeta");
    l.push_back("shri");
    l.push_back("shivani");
    return l;
}


int main(){


    map<int,list<string>> data;
    list<string> list1;
    list1.push_back("Anjali");
    list1.push_back("Anjana");
    list1.push_back("Akshay");
    list<string> list2;
    list2.push_back("raj");
    list2.push_back("rajesh");
    list2.push_back("ram");

    data[1]=list1;
    data[2]=list2;
    data[3]=dmeo();

    //auto
    for(auto it=data.begin();it!=data.end();it++){
        cout<<it->first<<" ";
        for(auto it1=it->second.begin();it1!=it->second.end();it1++){
            cout<<*it1<<" ";
        }
        cout<<endl;
    }

    map<int,list<string>>::iterator it;
    list<string> ::iterator it1;
    
    for(it =data.begin();it!=data.end();it++){
        cout<<it->first<<" ";
        for(it1 = it->second.begin();it1!=it->second.end();it1++){
            cout<<*it1<<" ";
        }
        cout<<"\n";
    }


    

}