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

    def push(self, value):
        newNode = Node(value)
        if( not self.head):
            self.head = newNode
            self.tail = self.head
        else:
            temp = self.head
            while(temp.next):
                temp = temp.next
            temp.next = newNode
            temp = newNode
        self.length = self.length + 1
    
    def get(self,index):
        temp = self.head
        for i in range(index):
            temp = temp.next
        return temp.data

    def pop(self):
        if(self.length == 0):
            return None
        pre = self.head
        temp = self.head
        while(temp.next):
            pre = temp
            temp = temp.next
        self.tail = pre
        self.tail.next = None
        self.length -= 1
        if(self.length == 0):
            self.head = None
            self.tail = None
        return temp.data        

linkedList = LinkedList(5)
linkedList.push(10)
linkedList.push(5)
linkedList.push(15)
print(linkedList.pop())
print(linkedList.pop())
print(linkedList.pop())