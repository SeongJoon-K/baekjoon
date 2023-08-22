
# data = input()

# list_number = [int(i) for i in data] 

# sum = 0

# for i in range(0,len(list_number)-1):
#     # 맨처음일 때
#     if (i == 0):
#         if (list_number[i] == 0 or list_number[i+1] == 0):
#             sum = list_number[i] + list_number[i+1]
#             print(f"{i} 번째 계산값 {sum} ")
#             continue
#         elif (list_number[i] != 0 and list_number[i+1] != 0):
#             sum = list_number[i] * list_number[i+1]
#             print(f"{i} 번째 계산값 {sum} ")
    
#     else :
#         if (sum == 0 or list_number[i+1] == 0):
#             print(sum, list_number[i+1])
#             sum += list_number[i+1]
#             print(f"{i} 번째 계산값 {sum} ")
#             continue
#         elif (sum != 0 and list_number[i+1] != 0):
#             print(sum, list_number[i+1])
#             sum *= list_number[i+1]
#             print(f"{i} 번째 계산값 {sum} ")

# print(sum)

data = input()

# 첫 번째 문자를 숫자로 변경하여 대입

for i in range(1, len(data)):
    num = int(data[i])
    if num <= 1 or result <= 1:
        result += num
    else: 
        result *= num

print(result)
