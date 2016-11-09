static Queue <Node> queue = new LinkedList <Node> ();

static void levelOrder(Node root){
    if (root != null){
        queue.add(root);
    }
    while (!queue.isEmpty()){
        Node n = queue.remove();
        System.out.print(n.data + " ");
        if (n.left != null){
            queue.add(n.left);
        }
        if (n.right != null) {
            queue.add(n.right);
        }
    }   
}
