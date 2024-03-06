class Solution(object):
    def countPrimes(self, n):
        if n<=2:
            return 0
        a=[1]*(n)
        a[0]=0
        a[1]=0
        for i in range(2,n):
            if a[i]:
                if a[i]:
                    for j in range(i*i,n,i):
                        a[j]=0
        return(a.count(1))     
        
