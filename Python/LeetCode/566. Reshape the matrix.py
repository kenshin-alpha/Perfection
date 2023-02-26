def matrixReshape( mat, r: int, c: int) :
    if(len(mat) * len(mat[0]) != r * c):
        return mat
    actual = []
    for i in mat:
        for j in i:
            actual.append(j)
    result = []

    k = 0
    for i in range(r):
        li = []
        for j in range(c):
            li.append(actual[k])
            k += 1
        result.append(li)
    return result

print(matrixReshape([[1,2],[3,4]],1,4))
print(matrixReshape([[1,2],[3,4]],2,4))

    # def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
    #     m, n = len(mat), len(mat[0])
    #     if r * c != m * n: return mat  # Invalid size -> return original matrix
    #     ans = [[0] * c for _ in range(r)]
    #     for i in range(m * n):
    #         ans[i // c][i % c] = mat[i // n][i % n]
    #     return ans