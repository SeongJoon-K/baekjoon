a, b = map(int,input().split(" "))

chess_table = []
cnt = []
for i in range(a):
    chess_table.append(input())

for i in range(a-7):
    for j in range(b-7):
        w_start = 0
        b_start = 0
        for k in range(i, i+8):
            for l in range(j, j+8):
                if (k+l) % 2 ==0:
                  if chess_table[k][l] != 'W':
                      w_start = w_start+ 1
                  if chess_table[k][l] != 'B':
                      b_start = b_start+ 1
                else :
                  if chess_table[k][l] != 'B':
                      w_start =w_start + 1
                  if chess_table[k][l] != 'W':
                      b_start = b_start +1
        cnt.append(w_start)
        cnt.append(b_start)
print(min(cnt))