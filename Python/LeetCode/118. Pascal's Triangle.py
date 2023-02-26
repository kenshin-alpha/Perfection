def generate(numRows: int) :
    result = [[1]]
    for i in range(1, numRows):
        result.append( list(map(lambda x,y:x+y,result[-1] + [0],[0] + result[-1])))
    return result

print(generate(6))