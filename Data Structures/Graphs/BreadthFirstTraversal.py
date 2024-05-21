graph = {
    "a" : ["b","c"],
    "b" : ["d"],
    "c" : ["e","f"],
    "d" : ["f"],
    "e" : [],
    "f" : []
}

def breadthFirstTraversal(graph, source):
    queue = [source]
    while(len(queue) > 0):
        current = queue[-1]
        queue = queue[:-1]
        print(current)
        for i in graph[current]:
            queue.insert(0,i)

breadthFirstTraversal(graph,"a")
