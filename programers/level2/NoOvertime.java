class NoOvertime {
   public int noOvertime(int no, int[] works) {
    int result = 0;
    int sum =0;
    works = getArray(no, works);

    for (int j=0; j<works.length; j++) {
        System.out.println("t"+works[j]);
        result +=works[j]*works[j];
      }

    System.out.println(result);

        return result;
    }
    public static void main(String[] args) {
        NoOvertime c = new NoOvertime();
        int []test = {19,17,16,15,8};
        System.out.println(c.noOvertime(34,test));
    }

  public int[] getArray(int no, int[] array) {
    int temp=0;
    while (no!=0) {
     for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {                                           
                if(array[i] < array[j]) {                                        
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            }
      array[0]-=1;
      no--;
    }
    return array;
  }
}
