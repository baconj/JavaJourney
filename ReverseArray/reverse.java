public class Reverse {
    public static void main(String[] args) {

        int[] array = new int[] {2,4,5,6,7,8,9};
                System.out.println("Original Array:");
                for(int i = 0; i < array.length; i++)
                    System.out.print(array[i] + " ");

                System.out.println();

                System.out.println("Array in reverse");
                for(int i=array.length-1;i>=0;i--)
                    System.out.print(array[i] + " ");
            }
    }
