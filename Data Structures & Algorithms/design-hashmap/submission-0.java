class MyHashMap {
    List<int[]> list;
    
    public MyHashMap() {
        list = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        for(int i = 0; i < list.size(); i++) {
            int[] pair = list.get(i);

            if (pair[0] == key) {
                pair[1] = value;
                return;
            }
        }

        int[] newPair = {key, value};
        list.add(newPair);
    }
    
    public int get(int key) {
        for(int i = 0; i < list.size(); i++) {
            int[] pair = list.get(i);

            if (pair[0] == key) {
                return pair[1];
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        for(int i = 0; i < list.size(); i++) {
            int[] pair = list.get(i);

            if (pair[0] == key) list.remove(pair);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */