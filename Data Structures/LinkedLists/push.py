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
            temp = self.head
            while(temp.next):
                temp = temp.next
            temp.next = newNode
            temp = newNode

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