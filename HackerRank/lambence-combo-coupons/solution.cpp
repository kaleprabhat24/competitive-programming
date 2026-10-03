#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, m, need;
    cin >> n >> m >> need;

    vector<long long> p(n);
    for (auto &x : p) cin >> x;

    string type;
    cin >> type;

    vector<long long> pref(n + 1, 0);

    // pref[i] = money in first i items
    for (int i = 0; i < n; i++) {
        pref[i + 1] = pref[i] + p[i];
    }

    /*
       For a combo [left ... right]:

       sum = pref[right+1] - pref[left]

       sum % m == 0 only when both prefix remainders match.

       The other slightly annoying condition is that the combo
       needs an M item. latestM takes care of that.
    */

    long long ans = 0;
    int latestM = -1;

    // remainder -> positions where this remainder occurred
    unordered_map<long long, vector<int>> seen;

    for (int i = 0; i <= n; i++) {
        long long rem = pref[i] % m;
        seen[rem].push_back(i);
    }

    for (int right = 0; right < n; right++) {

        if (type[right] == 'M') {
            latestM = right;
        }

        // left <= right - need + 1
        int limit = right - need + 1;

        if (limit < 0 || latestM == -1)
            continue;

        /*
            Both conditions have to hold:

            left <= limit       -> enough items
            left <= latestM     -> at least one M

            So use whichever boundary is smaller.
        */
        limit = min(limit, latestM);

        long long wanted = pref[right + 1] % m;

        auto it = seen.find(wanted);

        if (it == seen.end())
            continue;

        auto &v = it->second;

        // Count prefix positions <= limit having this remainder.
        ans += upper_bound(v.begin(), v.end(), limit) - v.begin();
    }

    cout << ans << '\n';

    return 0;
}
