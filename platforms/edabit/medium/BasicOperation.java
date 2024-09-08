public class BasicOperation {
    public static int operation(String a, String b, String op) {
      // Convert strings to integers
      int num1 = Integer.parseInt(a);
      int num2 = Integer.parseInt(b);
  
      // Perform the operation based on the given 'op'
      if(op.equals("add")){
        return num1 + num2;
      }
      if(op.equals("subtract")){
        return num1 - num2;
      }
      if(op.equals("divide")){
        // Handle division by zero case
        if(num2 == 0){
          return Integer.MIN_VALUE;
        }
        return num1 / num2;  // Integer division
      }
      if(op.equals("multiply")){
        return num1 * num2;
      }
      
      // If the operation is not recognized, return some default value (e.g. 0)
      return 0;
    }
  
    public static void main(String[] args){
      // Test cases
      System.out.println(operation("5", "6", "add"));         // Output: 11
      System.out.println(operation("4", "5", "subtract"));    // Output: -1
      System.out.println(operation("6", "3", "divide"));      // Output: 2
      System.out.println(operation("2", "0", "divide"));      // Output: -2147483648 (Integer.MIN_VALUE)
      System.out.println(operation("3", "7", "multiply"));    // Output: 21
    }
  }
  