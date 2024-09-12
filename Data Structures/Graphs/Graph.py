class graph:
    def __init__(self):
        self.adjacencyList = {}

    def addVertex(self,vertex):
        if(not self.adjacencyList.get(vertex,False)):
            self.adjacencyList[vertex] = []
            return True
        return False
    
    def addEdge(self, vertex1, vertex2):
        if(vertex1, vertex2 in self.adjacencyList.keys()):
            self.adjacencyList[vertex1] += [vertex2]
            self.adjacencyList[vertex2] += [vertex1]
            return True
        return False

    def removeEdge(self, vertex1, vertex2):
        if(vertex1, vertex2 in self.adjacencyList.keys()):
            self.adjacencyList[vertex1] = [i for i in self.adjacencyList[vertex1] if(i != vertex2)]
            self.adjacencyList[vertex2] = [i for i in self.adjacencyList[vertex2] if(i != vertex1)]
            return True
        return False

    def removeVertex(self, vertex):
        if(self.adjacencyList[vertex]):
            for value in self.adjacencyList[vertex]:
                self.removeEdge(vertex, value)
            self.adjacencyList.pop(vertex)
            return True
        return False
    
    def printGraph(self):
        print(self.adjacencyList)


gh = graph()
gh.addVertex(2)
gh.addVertex(5)
gh.addVertex(4)
gh.addEdge(2,5)
gh.addEdge(2,4)
gh.printGraph()
gh.removeVertex(2)
gh.printGraph()


