# cook your dish here
for i in range(int(input())):
    t=int(input())
    t=bin(t)
    s=str(t)
    c=s.count("1")
    if(c%2==0):
        print("even")
    else:
        print("odd")
