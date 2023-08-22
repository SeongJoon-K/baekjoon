# 동r 서L 남D 북U 이동
n = int(input())
data = list(map(str,input().split()))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

x,y = 1,1

def go_right():
    return x + dx[0], y + dy[0]

def go_left():
    return x + dx[1], y + dy[1]

def go_down():
    return x + dx[2], y + dy[2]

def go_up():
    return x + dx[3], y + dy[3]

for i in range(0, n+1):
    if (y<100 and data[i] == "R"):
        x,y = go_right()
    elif (y> 1 and data[i]== "L"):
        x,y =go_left()
    elif (x > 1 and data[i]== "U"):
        x,y =go_up()
    elif (x < 100 and data[i]== "D"):
        x,y =go_down()
    print(f"현재 좌표{x}, {y}")

print(x,y)


# 동r 서L 남D 북U 이동
n = int(input())
data = list(map(str,input().split()))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]

x,y = 1,1

move_types = ['L','R','U','D']

for plan in plans:
    for i in range(len(move_types)):
        if (plan == move_types[i]):
            nx = x + dx[i]
            ny = y + dy[i]
    # 공간 벗어나면 무시함
    if nx < 1 or ny <1 or nx > n or ny >n:
        continue
    # 이동 수행
    x, y = nx, ny

print(x, y)