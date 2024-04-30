public int removeAt(int key) { 

    if (isEmpty()) { 
        
        print("List is empty"); 
    
    } else {
        Node currentNode = head;
        while (currentNode.next != nill) {
            if (currentNode.next.data == key) {
                currentNode.next = currentNode.next.next;
                break;
            }
        }
         
        currentNode = currentNode.next;
        
    }
}