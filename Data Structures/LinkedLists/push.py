class Node:
    def __init__(self, value) -> None:
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self, value):
        newNode = Node(value)
        self.head = newNode
        self.tail = self.head
        self.length = 1

    def push(self, value):
        newNode = Node(value)
        if(not self.head):
            self.head = newNode
            self.tail = self.head
        else:
            self.tail.next = newNode
            self.tail = newNode
        self.length += 1
        
    def printList(self):
        temp = self.head
        while(temp.next):
            print(temp.value)
            temp = temp.next
        

linkedList = LinkedList(5)
linkedList.push(10)
linkedList.push(20)
linkedList.push(40)

linkedList.printList()