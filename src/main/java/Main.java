public class Main {
  public static void main(String[] args) {
    
    int[] array = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576};
    int num = 524288;

    int result = interpolationSearch(array, num);

    if(result != -1){
      System.out.println("Number "+ num +" found at the index "+ result);
    } else {
      System.out.println("Couldn't find the number "+ num +" at the array");
    }
      
  }

  static int interpolationSearch(int[] arr, int num){
    if(arr.length == 0){
      return -1;
    }

    int first = 0;
    int last = arr.length - 1;
    int count = 0;

    while(first <= last && num >= arr[first] && num <= arr[last]){
      int pos = first + ((num - arr[first]) * (last - first)) / (arr[last] - arr[first]);

      if(arr[pos] == num){
        System.out.println("Number found in "+ count +" attempts");
        return pos;
      }

      if(arr[pos] < num){
        first = pos + 1;
      }

      if(arr[pos] > num){
        last = pos - 1;
      }

      count++;
    }

    return -1;
    
  }

}