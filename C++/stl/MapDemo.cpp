#include<iostream>
#include<map>
#include<string>
using namespace std;

int main(){

    map<char,string> rank;

    rank['A']="Ace";
    rank['B']="Two";
    rank['C']="Three";
    rank['D']="Four";
    rank['A']="Anjali";

    cout<<rank['A']<<endl;

    map<char,string>::iterator it;
    for(it = rank.begin();it!=rank.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }

    //rank.erase('a');
    rank.insert(pair<char,string>('a',"Anjali"));
    //cout<<rank.find('a');

    cout<<"count..."<<rank.count('A');

    


    cout<<"\n after earese \n";

    for(it = rank.begin();it!=rank.end();it++){
        cout<<it->first<<" "<<it->second<<endl;
    }
    

}
