class MyHashMap {
  
HashMap<Integer,Integer> mymap;
    public MyHashMap() {
        mymap=new HashMap<Integer,Integer>();
       
    }
    
    public void put(int key, int value) {
        mymap.put(key,value);
    }
    
    public int get(int key) {
        if(mymap.get(key)==null){
            return -1;
        }
        else{
            return mymap.get(key);
        }
    }
    
    public void remove(int key) {
        mymap.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */