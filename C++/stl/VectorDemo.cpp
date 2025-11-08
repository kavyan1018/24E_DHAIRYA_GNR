#include<iostream>
#include<vector>
#include<string>
using namespace std;


int main(){

    vector<char> chars;
    chars.push_back('a');
    chars.push_back('b');
    chars.push_back('c');
    chars.push_back('d');
    chars.push_back('e');
    chars.push_back('f');

    cout<<chars[0]<<endl;
    cout<<chars.at(0)<<endl;

    cout<<chars.back()<<endl;
    cout<<chars.front()<<endl;
    cout<<chars.size()<<endl;

    chars.erase(chars.begin()+0);

    cout<<chars.size()<<endl;

    cout<<"\n\n using index....";


    for(int i=0;i<chars.size();i++){
        cout<<chars[i]<<endl;
    }

    cout<<"\n\n using iterator....";

    vector<char>::iterator it;

    for(it = chars.begin();it!=chars.end();it++){
        cout<<*it<<endl;
    }

    cout<<"\n\n using for loop....";

    for(int i=0;i<chars.size();i++){

        cout<<"\n"<<chars.at(i)<<endl;
    }

    cout<<"\n\n using for each loop....";


    chars.insert(chars.begin()+1,'z');

    chars.at(2)='O';
    for(char c:chars){
        cout<<"\n"<<c<<endl;
    }




}