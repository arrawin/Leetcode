class NumberContainers {
    Map < Integer , Integer > index_val ; 
    Map < Integer , TreeSet<Integer> > val_index;

    public NumberContainers() {
        index_val = new HashMap<>();
        val_index = new HashMap<>();
        
    }
    
    public void change(int index, int number) {
        if(index_val.containsKey(index))
        {
            int new_val = index_val.get(index);
            if(new_val == number) return ;
            val_index.get(new_val).remove(index);
            if(val_index.get(new_val).isEmpty())
            {
                val_index.remove(new_val);
            }

        }
        index_val.put(index,number);
        TreeSet < Integer > set = val_index.getOrDefault(number , new TreeSet<>());
        set.add(index);
        val_index.put (number , set );
        
    }
    
    public int find(int number) {
        if(val_index.containsKey(number))
        {
            TreeSet < Integer > set = val_index.get(number);
            return set.first();

        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */