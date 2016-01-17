class Node {
   private int data;
   Node left;
   Node right;
   
   public Node(int n) {
      this.data = n;
      this.left = null;
      this.right = null;
   }
   
   public int getData() {
      return this.data;
   }
}