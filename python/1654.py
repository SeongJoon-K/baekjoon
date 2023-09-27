# 박성원 - 캠프에 쓸 N개의 랜선만들어야 함
# 오영식 - K개의 랜선이 있음

# but, K개의 랜선은 길이가 모두 다르다

def binary_search(array, target, start, end):
    while start <= end:
        mid = (start + end) // 2
        
        if array[mid] == target:
            return mid
        elif array[mid] > target:
            end = mid -1
        else:
            start = mid +1
        
    return None


# input 
# 갖고 있는 랜선 갯수 K, 필요한 랜선의 갯수 11
K, N = map(int, input().split())
LAN = [int(input()) for _ in range(K)]

start, end = 1, max(LAN)

# 길이순으로 정렬함 


# 만약에 K <= N 이면 
while start <= end:
    mid = (start + end)//2
    num = 0

    for i in LAN:
        num = num + i // mid
    
    if num >= N: # 최대 크기에서 반 자른거 보다 많으면 mid의 크기를 늘려야함
        start = mid + 1
    else :
        end = mid - 1
# 주어진 길이의 최대를 출력해야하기 때문
print(end)

# 100 5 
# 40 2 
# 30 0 
# 20 0

# N = 2 일 때 -> 50
# N = 3 일때 -> 40
# N = 4 일때 -> 33
# N = 5 일때 - > 30
# N = 6 일때 -> 25
# N = 7 일때 -> 20 

# N = 2 일때 가장 큰 수에 절반이 두 번째 수보다 크면 그걸로 한다
# N = 3 일때 가장 큰 수의 절반이 두 번째 수보다 작으면 세 번째 수의 값이 첫 번째 절반 보다 작은지 본다 , 
#     만약 첫 번째의 절반값이 세번째 보다 크면 첫번째 수의 절반이 답이다
#     그게 아니면 세 번째 수의 값이 정답이다
# N = 4 일때 가장 큰 수의 절반이 세 번째 수보다 작으면 네 번째 수의 값이 첫 번째 절반과 같은 지 본다, 
#     만약 첫번째 절반 값이 네번째보다 크면 첫번째 수의 절반이 답이다
#     그게 아니면 네 번째 수의 값이 정답이다
# N ~~~ 

# N = 두 번째 값의 절반이 세번째 보다 크면