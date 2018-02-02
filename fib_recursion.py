
def fib(n):
    if n == 0:
        return 0
    elif n < 2:
        return 1
    else:
        a = fib(n-1)
        b = fib(n-2)
        return a +b
if __name__ == "__main__":
    print (fib(3))
    print (fib(5))
    print (fib(6))
    

#fib(n)
    # a = fib(4) = 3
        ## a = fib(3) = 2
            ### a = fib(2) = 1
                  #### a = fib(1) = 1
                  #### b = fib(0) = 0
                  #### return a+b = 1
            ### b = fib(1) = 1
            ### return a+b = 2
        ## b = fib(2) = 1
        ## return a+b = 3
    # b = fib(3)
    # return a+b = 5
    
''' read from up down'''