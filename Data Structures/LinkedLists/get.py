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
        temp = self.head
        for i in range(index):
            temp = temp.next
        return temp.value


linkedList = LinkedList(5)
print(linkedList.head.value)
print(linkedList.get(0))
    
        