# 첫째줄에 정수 N을 입력함
# 00시 00분 00초 부터 N시 59분 59초 까지 시각에서 3이 포함되는 모든 경우를 세라

n = int(input())
minutes = 60
seconds = 60

count = 0



for i in range(0,n+1) :
    for minute in range(0,61):
        minute_list = list(map(int,str(minute)))
        print(minute_list)
        if (minute_list[0] ==3 ):
            count += 1
        elif (minute_list[1])
        for second in range(0,61):
            second_list = list(map(int,str(second)))
            if (second_list[0] or second_list[1]):
                count += 1

print(count)