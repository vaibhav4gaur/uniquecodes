//Quick find way implementation
class UnionandFind{
    int [] arr;
    UnionandFind(int size){
        arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = i;
        }
    }

   int find(int val){
    return arr[val];
    }


    void union(int x, int y){
      int rootX = find(x);
       int rootY = find(y);
  //stop when roots are same
  // if root are not same

  if(rootX != rootY){
      for(int i=0; i<arr.length; i++){
        if(arr[i] == rootY){
            arr[i] = rootX;
        }
      }
     }
    }
    boolean connected(int x , int y){
        return find(x) == find(y);
    }
    public static void main(String[] args) {
        UnionandFind obj = new UnionandFind(7);
        obj.union(0,1);
        obj.union(1,2);
        obj.union(1,3);
        obj.union(2,6);
        obj.union(2,5);
        
        obj.union(3,4);
        System.out.println(obj.connected(1, 5));
        System.out.println(obj.connected(5, 6));
        System.out.println(obj.connected(4, 5));
    }
}