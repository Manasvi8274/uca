// jitendra17dec4
// codeforces  round 959 div 1+ div 2 Solution
// jay maa sarswati

#include <bits/stdc++.h>
using namespace std;
using namespace chrono;
#define MOD 1000000007
#define MOD1 998244353
#define INF 1e18
#define nline "\n"
#define pb push_back
#define ppb pop_back
#define mp make_pair
#define epb emplace_back
#define ff first
#define ss second
#define PI 3.141592653589793238462
#define set_bits __builtin_popcountll
#define sz(x) ((int)(x).size())
#define all(x) (x).begin(), (x).end()
typedef long long ll;
#define int long long
typedef vector<int> vi;
typedef vector<long long> vl;
#define fastio()                      \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(NULL)
#define fl(i, a, b) for (int i = a; i < b; i++)
void debug(vector<int> arr)
{
    for (auto &i : arr)
    {
        cout << i << " ";
    }
    cout << nline;
}
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ll gcd(ll a, ll b)
{
    if (b > a)
    {
        return gcd(b, a);
    }
    if (b == 0)
    {
        return a;
    }
    return gcd(b, a % b);
}
ll expo(ll a, ll b, ll mod)
{
    ll res = 1;
    while (b > 0)
    {
        if (b & 1)
            res = (res * a) % mod;
        a = (a * a) % mod;
        b = b >> 1;
    }
    return res;
}
void extendgcd(ll a, ll b, ll *v)
{
    if (b == 0)
    {
        v[0] = 1;
        v[1] = 0;
        v[2] = a;
        return;
    }
    extendgcd(b, a % b, v);
    ll x = v[1];
    v[1] = v[0] - v[1] * (a / b);
    v[0] = x;
    return;
} // pass an arry of size1 3
ll mminv(ll a, ll b)
{
    ll arr[3];
    extendgcd(a, b, arr);
    return arr[0];
} // for non prime b
ll mminvprime(ll a, ll b) { return expo(a, b - 2, b); }
ll lcm(ll a, ll b) { return (a * b) / gcd(a, b); }
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~    mod ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
ll mod_add(ll a, ll b, ll m)
{
    a = a % m;
    b = b % m;
    return (((a + b) % m) + m) % m;
}
ll mod_mul(ll a, ll b, ll m)
{
    a = a % m;
    b = b % m;
    return (((a * b) % m) + m) % m;
}
ll mod_sub(ll a, ll b, ll m)
{
    a = a % m;
    b = b % m;
    return (((a - b) % m) + m) % m;
}
ll mod_div(ll a, ll b, ll m)
{
    a = a % m;
    b = b % m;
    return (mod_mul(a, mminvprime(b, m), m) + m) % m;
} // only for prime m
ll phin(ll n)
{
    ll number = n;
    if (n % 2 == 0)
    {
        number /= 2;
        while (n % 2 == 0)
            n /= 2;
    }
    for (ll i = 3; i <= sqrt(n); i += 2)
    {
        if (n % i == 0)
        {
            while (n % i == 0)
                n /= i;
            number = (number / i * (i - 1));
        }
    }
    if (n > 1)
        number = (number / n * (n - 1));
    return number;
} // O(sqrt(N))
vector<pair<int, int>> direction = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// use binary search in pair vector

int lower_bound(vector<pair<int, int>> &v, int &target)
{
    int start = 0;
    int end = v.size() - 1;
    int ans = v.size();
    while (start <= end)
    {
        int mid = (start + end) / 2;
        if (v[mid].first < target)
        {
            start = mid + 1;
        }
        else
        {
            ans = mid;
            end = mid - 1;
        }
    }
    return ans;
} // O(log n)

const int maxn = 1000100;

struct Node
{
    int l, r, x;
} a[maxn];
struct edge
{
    int u, v, d;
    edge(int a = 0, int b = 0, int c = 0) : u(a), v(b), d(c) {}
} E[maxn];

int mod = 998244353;
template <typename T>
void Dfill(std::vector<T> &vec)
{
    for (auto &i : vec)
        std::cin >> i;
}
vector<int> dp;
// precuation
// check code properly min  two time
// build good testcase then submit
signed main()
{
    int t = 1;
    cin >> t;
    while (t--)
    {
        int n, d, l;
        std::cin >> n >> d >> l;
        int rn = n;

        int used = d + 1;
        n -= d + 1;
        l -= 2;
        if ((std::ceil((n * 1.0) / l) > d / 2) || (rn - used) < l)
        {
            std::cout << -1 << '\n';
        }
        else
        {
            int i = 1;
            for (i; i < used; i++)
            {
                std::cout << i << ' ' << i + 1 << '\n';
            }
            int temp = (used + 1) / 2;

            i++;
            std::vector<int> prevs(l, temp);
            int p = 0;
            while (i <= rn)
            {
                std::cout << prevs[p] << ' ' << i++ << '\n';
                prevs[p] = i - 1;
                p++;
                if (p == prevs.size())
                {
                    p = 0;
                }
            }
        }
    }
}