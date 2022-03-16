# 실습과제 1

# name = input("이름입력 : ")
# age = int(input("나이입력 : "))
# year = int(input("현재년도입력 : "))

# print(name, "님은 현재", age, "살이고 100살이되는 년도는", (year - age + 100))


# 실습과제 2

import turtle
n1 = int(input("첫 번째 숫자 입력: "))
n2 = int(input("두 번째 숫자 입력: "))
n3 = int(input("세 번째 숫자 입력: "))

average = ((n1 + n2 + n3)/3)
print(average)

# # 실습과제 3

# import turtle

# t = turtle.Turtle()
# t.shape("turtle")

# radius = 40

# t.circle(radius)
# radius += 20
# t.circle(radius)
# radius += 20
# t.circle(radius)

# turtle.done()
# turtle.exitonclick()


t = turtle.Turtle()
t.shape("turtle")
side = 100

t.forward(100)
t.left(120)
t.forward(100)
t.left(120)
t.forward(100)
t.left(120)

turtle.done()
turtle.exitonclick()


colors = ["red", "purple", "blue", "green", "yellow", "orange"]
t = turtle.Turtle()

turtle.bgcolor("black")
t.speed(0)
t.width(3)
length = 10

while length < 500:
    t.forward(length)
    t.pencolor(colors[length % 6])
    t.right(89)
    length += 5

turtle.done()
turtle.exitonclick()


t = turtle.Turtle()
t.shape("turtle")

t.forward(100)
t.left(60)
t.forward(100)
t.left(60)
t.forward(100)
t.left(60)
t.forward(100)
t.left(60)
t.forward(100)
t.left(60)
t.forward(100)

t.circle(100)

turtle.done()
turtle.exitonclick()
