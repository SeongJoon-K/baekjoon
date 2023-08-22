n = int(input())

data = list(map(int, input().split()))

sort_data = sorted(data)

group_count = 0
current_fear = 0
current_count = 0


for i in range(len(sort_data)):
    current_count += 1
    current_fear = sort_data[i]
    if (current_fear == current_count):
        group_count += 1
        current_count = 0

print(group_count)