#include<iostream>
using namespace std;
bool is_prime(int n)
{ if(n<=2||n%2==0)
{
    return false;
}
    for(int i=3;i*i<=n;i+=2)
    {
        if(n%i==0)
            return false;}

        return true;
}


int main ()
{
  int n,m;cin>>n>>m;

  if(!is_prime(m))
  {
      cout<<"NO";
      return 0;
  }

  for(int i=n+1;i<m;i++)
  {
      if(is_prime(i))
      {
          cout<<"NO";
          return 0;
      }
  }
  cout<<"YES";



    return 0;
    }

