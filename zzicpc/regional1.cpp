#include <stdio.h>
#include <bits/stdc++.h>

using namespace std;

int main()
{

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string str;
        cin >> str;
        stack<int> st;
        int fb=0,bb=0;

        for (int i = 0; i < n; i++)
        {
            if(str[i] == '(')   fb++;
            if(str[i] == ')')   bb++;
            if (st.empty())
            {
                st.push(str[i]);
            }
            else if (str[i] == '(')
            {
                st.push(i);
            }
            else if (str[i] == ')')
            {
                if (st.empty() || str[st.top()] == ')')
                {
                    st.push(i);
                }
                else
                {
                    st.pop();
                }
            }
        }
        
        if (st.size() != 0)
        {
            int ans = 0;
            int c = 0;
            if(str[n-1] == '('){
                for(int i=0;i<n;i++){
                    if(str[i] == ')'){
                        c++;
                    }
                    else{
                        if(fb-1 != 1){
                            ans+=c;
                            fb-=1;
                        }
                        else{
                            ans+=c+1;
                            break;
                        }
                    }
                }
            }
            else{
                string s="";
                // cout << "before s= " << s << endl;
                int end=st.top();
                int cfb=0,cbb=0;
                for(int i=0;i<=end;i++){
                    s+=str[i];
                }
                // cout<<"s= "<<s<<endl;
                end++;
                ans=0;
                c=0;
                for (int i = 0; i < s.size(); i++)
                {
                    if (s[i] == ')')
                    {
                        c++;
                    }
                    else
                    {
                        if (cfb - 1 != 1)
                        {
                            ans += c;
                            cfb -= 1;
                        }
                        else
                        {
                            ans += c + 1;
                            break;
                        }
                    }
                }
                c=0;
                cfb=fb-cfb;
                cbb=bb-cbb;
                // cout<<"before final ans="<<ans<<endl;
                for (int i = end+1; i < n; i++)
                {
                    if (str[i] == ')')
                    {
                        c++;
                    }
                    else
                    {
                        if (fb - 1 != 1)
                        {
                            ans += c;
                            fb -= 1;
                        }
                        else
                        {
                            ans += c + 1;
                            break;
                        }
                    }
                }
            }
            cout<<ans<<endl;
            
        }
        else
        {
            cout << 0 << endl;
        }
    }
}