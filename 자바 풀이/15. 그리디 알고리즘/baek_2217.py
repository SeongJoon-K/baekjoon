N = int(input())  # 로프의 갯수
lope = []
for i in range(0, N):
    lope.append(int(input()))
# 각 로프별 중량입력
lope.sort(reverse=True)
power = 0
weight_max = 0

for i in range(0, N):

    power = lope[i]*(i+1)
    if weight_max < power:
        weight_max = power
print(weight_max)
