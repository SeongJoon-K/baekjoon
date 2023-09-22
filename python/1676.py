# 1. n!을 입력한다.
n = int(input())

# 2. 팩토리얼을 계산한다.
def factorial_result(num):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

def check_zero(result):
    count = 0
    for i in reversed(str(result)):
        if i != '0':
            break
        if i == '0':
            count+=1
    return count

result = factorial_result(n)
print(check_zero(result))