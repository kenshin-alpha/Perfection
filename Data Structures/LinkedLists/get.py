class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self,value):
        newNode = Node(value)
        self.head = newNode
        self.tail = self.head
        self.length = 1

    def get(self,index):
        for i in self.length - 1:
            self.tail = self.tail.next
        return self.tail.value
    
    
        