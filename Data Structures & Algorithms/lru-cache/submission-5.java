class LRUCache {

    // Brute force attempt trying LinkedList + HashMap (Inefficient)

    Map<Integer, Integer> cache;
    LinkedList<Integer> linkedList;
    Integer capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.linkedList = new LinkedList<>();
    }
    
    public int get(int key) {
        
        int res = -1;

        if (cache.containsKey(key)) {

            res = cache.get(key);
            linkedList.remove(linkedList.indexOf(key));
            linkedList.addLast(key);

        }

        if (linkedList.size() > capacity) {
            cache.remove(linkedList.getFirst());
        }

        return res;

    }
    
    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            linkedList.remove(linkedList.indexOf(key));
            cache.remove(key);
        } 

        cache.put(key, value);
        linkedList.addLast(key);

        if (linkedList.size() > capacity) {
            cache.remove(linkedList.getFirst());
            linkedList.removeFirst();
        }
    }
}