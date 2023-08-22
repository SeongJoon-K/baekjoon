N = int(input()) # 색종이를 몇 번 붙일 것인지

frame = [[ 0 for i in range(100)] for _ in range(100)]

size = 0

def fill_black_space(arr, x, y):
    for i in range(10):
        for j in range(10):
            arr[x+i][y+j] += 1

for i in range(N):
    x,y = map(int,input().split())
    fill_black_space(frame, x,y)    


for i in frame : 
    for j in i:
        if (j > 0) :
            size += 1

print(size)