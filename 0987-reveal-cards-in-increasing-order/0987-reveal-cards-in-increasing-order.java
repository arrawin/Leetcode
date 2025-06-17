class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        Arrays.sort(deck);
        for(int i = 0 ; i < deck.length ; i++){
            queue.offer(i);
        }
        int[] ans = new int[deck.length];
        for(int i = 0 ; i < deck.length ; i++){
            ans[queue.poll()] = deck[i];
            if(!queue.isEmpty()){
                queue.offer(queue.poll());
            }

        }
     return ans;
       
    }
}