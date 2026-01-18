class MyHashMap {
    boolean ans[];
    int arr[];
    public MyHashMap() {
        arr=new int[1000001];
        ans=new boolean[1000001];
    }
    
    public void put(int key, int value) {
        arr[key]=value;
        ans[key]=true;
    }
    
    public int get(int key) {
        if(!ans[key]) return -1;
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key]=0;
        ans[key]=false;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */