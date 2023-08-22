N, money = map(int, input().split())
coin = []
count = 0

for i in range(0, N):
    coin.append(int(input()))


for i in range(N-1, -1, -1):
    count += money // coin[i]
    money %= coin[i]
    if money == 0:
        break

print(count)
