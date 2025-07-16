class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def InsertAtBeginning(self,data):
        node = Node(data)
        node.next = self.head
        self.head = node

    def InsertAtMiddle(self,prev,data):
        node = Node(data)
        node.next = prev.next
        prev.next = node

    def InsertAtEnd(self,data):
        node = Node(data)
        if(self.head == None):
            self.head = node
            return
        last = self.head
        while(last.next != None):
            last = last.next
        last.next = node

    def DeleteAtPosition(self, position):
        if(self.head == None):
            return
        
        temp = self.head

        if(position == 0):
            self.head = temp.next
            temp = None
            return

        for i in range(position - 1):
            temp = temp.next
            if(temp == None):
                break
        
        if(temp == None):
            return
        
        next = temp.next.next
        temp.next = None
        temp.next = next

    def search(self, key):
        current = self.head
        while(current != None):
            if(current.data == key):
                return True
            current = current.next
        return False
    
    def SortLinkedList(self, head):
        current = head
        Index = Node(None)
        while(current.next is not None):
            Index = current.next
            while(Index is not None):
                if(current.data > Index.data):
                    current.data, Index.data = Index.data, current.data

                Index = Index.next
            current = current.next
    def printList(self):
        temp = self.head
        while (temp):
            print(str(temp.data) + " ", end="")
            temp = temp.next        

if __name__ == '__main__':

    llist = LinkedList()
    llist.InsertAtEnd(1)
    llist.InsertAtBeginning(2)
    llist.InsertAtBeginning(3)
    llist.InsertAtEnd(4)
    llist.InsertAtMiddle(llist.head.next, 5)

    print('linked list:')
    llist.printList()

    print("\nAfter deleting an element:")
    llist.DeleteAtPosition(3)
    llist.printList()

    print()
    item_to_find = 3
    if llist.search(item_to_find):
        print(str(item_to_find) + " is found")
    else:
        print(str(item_to_find) + " is not found")

    llist.SortLinkedList(llist.head)
    print("Sorted List: ")
    llist.printList()