// << ---- middleElementOfLinkedList Operation ---- >>
    public void middleElementOfLinkedList() {
        int size = 0;
        Node tmp = head; // Changed variable name from 'tmpe' to 'tmp'
        while (tmp != null) {
            size++;
            tmp = tmp.Next; // Move the pointer
        }
        tmp = head; // Reset the pointer
        System.out.println("size " + size);
        if (size % 2 == 0) {
            int n = size / 2;
            for (int i = 0; i < n; i++) {
                tmp = tmp.Next;
            }
            System.out.println("mid ele " + tmp.Data);
        } else {
            System.out.println("mid ele " + tmp.Data);
        }
    }
