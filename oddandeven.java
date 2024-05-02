
 class Main
{
	public static void main(String[] args) {
		int[] arr={1,3,5,2,4,6,11,12,15,16};
		int evennum=0;
		int oddnum=0;
		for(int i:arr){
			if(i%2==0){
				evennum++;
			}
			else if(i%2!=0){
				oddnum++;
			}

		}
		{
			System.out.println("even num are " + evennum);
			System.out.println("odd num are " + oddnum);
		}
	}
}