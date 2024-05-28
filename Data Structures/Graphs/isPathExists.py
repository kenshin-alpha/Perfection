graph = {
    "a" : ["b","c"],
    "b" : ["d"],
    "c" : ["e"],
    "d" : ["f"],
    "e" : [],
    "f" : []
}


def isPathExistsDFS(graph, source, target):
    stack = [source]
    while(len(stack) > 0):
        element = stack.pop()
        if(target == element):
            return True
        for i in graph[element]:
            stack.append(i)
    return False

print(isPathExistsDFS(graph, "a","f"))
print(isPathExistsDFS(graph, "a","x"))
print(isPathExistsDFS(graph, "a","e"))

def isPathExistsBFS(graph, source, target):
    queue = [source]
    while(len(queue) > 0):
        element = queue[-1]
        queue = queue[:-1]
        if(element == target):
            return True
        for i in graph[element]:
            queue.insert(0,i)
    return False

print(isPathExistsBFS(graph, "a","f"))
print(isPathExistsBFS(graph, "a","x"))
print(isPathExistsBFS(graph, "a","e"))
