	public static int getHeight(Node root){
        if (root == null){
            return -1;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }


