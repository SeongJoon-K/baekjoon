import sys

n = 1 # 임의의 수를 설정함
is_falindrome = True
result = []
while True:
    n = int(sys.stdin.readline().rstrip())    
    if (n == 0) :
        break
    is_falindrome = True
    str_num = str(n)
    # 짝 수 일때
    if (len(str_num) % 2 == 0):
        for i in range(len(str_num) // 2):
            
            if (str_num[i] != str_num[len(str_num) -1 -i]):
                result.append("no")
                is_falindrome = False
                break
        if (is_falindrome):
            result.append("yes")

    else : # 홀 수 일때 (len(str_num)// 2)
        for i in range(len(str_num) // 2):
            if (str_num[i] != str_num[len(str_num) -1 -i]):
                result.append("no")
                is_falindrome = False
                break
        if (is_falindrome):
            result.append("yes")

for i in result:
    print(i)
