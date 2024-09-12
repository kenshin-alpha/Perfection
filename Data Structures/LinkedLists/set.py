class Node:
    def __init__(self, value):
        self.data = value
        self.next = None

class LinkedList:
    def __init__(self, value):
        newNode = Node(value)
        self.head = newNode
        self.tail = self.head
        self.length = 1

    def printLinkedList(self):
        temp = self.head
        while(temp.next):
            print(temp.data)
            temp = temp.next
        
    def push(self, value):
        newNode = Node(value)
        if(self.length == 0):
            self.head = newNode
            self.tail = self.head
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1

    def pop(self):
        if(self.length == 0):
            return None
        temp = self.head
        pre = self.head
        while(temp.next):
            pre = temp
            temp = temp.next
        self.tail = pre
        self.tail.next = None
        self.length -= 1
        if(self.length == 0):
            self.head = None
            self.tail = None
        return temp.value
    
    def get(self, index):
        temp = self.head
        for i in range(index):
            temp = temp.next
        return temp
    
        

    def set(self, index, value):
        temp = self.get(index)
        if(not temp): return None
        else:
            temp.data = value