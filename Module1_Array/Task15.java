class PriorityQueueDS {

    int pq[];
    int size = -1;

    // constructor
    PriorityQueueDS(int capacity){
        pq = new int[capacity];
    }

    // ---------------- INSERT ----------------
    // enqueue with priority
    void insert(int val){

        System.out.println("Before insertion PQ");
        printPQ();

        size++;
        pq[size] = val;

        // heapify UP
        int i = size;

        while(i > 0){
            int parent = (i-1)/2;

            if(pq[parent] >= pq[i])
                break;

            swap(parent,i);
            i = parent;
        }

        System.out.println("After insertion PQ");
        printPQ();
    }

    // ---------------- DELETE ----------------
    // remove highest priority
    int delete(){

        if(size < 0){
            System.out.println("PQ Empty");
            return -1;
        }

        int removed = pq[0];

        pq[0] = pq[size];
        size--;

        heapifyDown(0);

        return removed;
    }

    // ---------------- HEAPIFY DOWN ----------------
    void heapifyDown(int i){

        while(true){

            int lci = 2*i + 1;
            int rci = 2*i + 2;

            if(lci > size) break;

            int maxChild;

            if(rci > size)
                maxChild = lci;
            else
                maxChild = (pq[lci] > pq[rci]) ? lci : rci;

            if(pq[i] >= pq[maxChild])
                break;

            swap(i,maxChild);
            i = maxChild;
        }
    }

    // ---------------- PEEK ----------------
    int peek(){
        if(size < 0) return -1;
        return pq[0];
    }

    // ---------------- UTILS ----------------
    void swap(int i,int j){
        int temp = pq[i];
        pq[i] = pq[j];
        pq[j] = temp;
    }

    void printPQ(){
        System.out.print("[");
        for(int i=0;i<=size;i++)
            System.out.print(pq[i]+",");
        System.out.println("]");
    }
}


class Main {

    public static void main(String[] args){

        int a[] = {1,2,3,4,5};

        PriorityQueueDS pq =
            new PriorityQueueDS(a.length);

        for(int i=0;i<a.length;i++){
            pq.insert(a[i]);
        }

        System.out.println("\nDelete Highest Priority");
        System.out.println("Removed = "+pq.delete());
        pq.printPQ();

        System.out.println("Peek = "+pq.peek());
    }
}
