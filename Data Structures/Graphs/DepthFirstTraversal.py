graph = {
    "a" : ["b","c"],
    "b" : ["d"],
    "c" : ["e"],
    "d" : ["f"],
    "e" : [],
    "f" : []
}


def DepthFirstTraversal(graph,source):

    stack = [source]
    while(len(stack) > 0):
        current = stack.pop()
        print(current)
        for i in graph[current]:
            stack.append(i)

DepthFirstTraversal(graph,"a")
