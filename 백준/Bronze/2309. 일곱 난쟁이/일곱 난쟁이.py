import sys
from itertools import combinations

hobits = [int(sys.stdin.readline()) for _ in range(9)]
hobits.sort()

for comb in combinations(hobits, 7):
    if sum(comb) == 100:
        for i in comb:
            print(i)
        break

