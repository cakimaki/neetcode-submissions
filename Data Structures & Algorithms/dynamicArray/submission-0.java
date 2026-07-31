class DynamicArray {
    
    private int arr[];
    private int current;
    private int capacity;
    public DynamicArray(int capacity) {
        if(capacity>0){
            this.arr= new int[capacity];
            this.current=0;
            this.capacity=capacity;
        }else{
            System.out.println("capacity problem");
        }
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if(capacity==current){
            resize();
        }
        arr[current++] = n;
    }

    public int popback() {
        return arr[--current];
    }

    private void resize() {
        int[] newArr= new int[capacity*2];
        for(int i=0;i<current;i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
        capacity = capacity * 2;
    }

    public int getSize() {
        return this.current;
    }
    //stylistic approach
    public int getCapacity() {
        return this.capacity;
    }
}
