# 2023년 9월 20일 수요일 11시 44분 시작

# 1. 단어의 갯수를 입력받는다
n = int(input())
word_list = []

# 2. 입력한 n 만큼 단어를 입력받는다
for i in range(n):
    word_list.append(input())

# 3. 해당 단어를 아래 조건으로 정렬시킨다
word_list.sort()
tmp = ""
# 4. 알파벳순으로 정렬했으니, 길이가 짧은 걸 앞으로 보내야함
for i in range(0, n-1):
    for j in range(i,n):
        if word_list[i] == word_list[j]:
            word_list.pop(j)

for i in range(0, n-1):
    for j in range(i,n):
        if len(word_list[i]) < len(word_list[j]):
            continue
        if len(word_list[i]) > len(word_list[j]):
            tmp = word_list[i]
            word_list[i] = word_list[j]
            word_list[j] = tmp
