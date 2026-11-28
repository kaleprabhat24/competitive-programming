import sys

def solve():
    input = sys.stdin.read
    data = input().split()
    
    T = int(data[0])
    idx = 1
    results = []
    
    for _ in range(T):
        X = int(data[idx])
        Y = int(data[idx + 1])
        N = int(data[idx + 2])
        R = int(data[idx + 3])
        idx += 4
        
        if N * X > R:
            results.append("-1")
        else:
            premium = min(N, (R - N * X) // (Y - X))
            normal = N - premium
            results.append(f"{normal} {premium}")
            
    print("\n".join(results))
