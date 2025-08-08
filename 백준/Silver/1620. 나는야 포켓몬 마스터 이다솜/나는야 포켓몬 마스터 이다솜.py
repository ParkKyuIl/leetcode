
import sys

n,m = map(int,sys.stdin.readline().split())

dict = {}
result = []

for i in range(1, n +1):
    a = sys.stdin.readline().rstrip()
    dict[i] = a
    dict[a] = i

for _ in range(m):
    question = sys.stdin.readline().rstrip()
    if(question.isdigit()):
        result.append(dict[int(question)])
    else:
        result.append(dict[question])


for i in range(0,m):
    print(result[i])
    


        




        




