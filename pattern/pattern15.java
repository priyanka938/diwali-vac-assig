class pattern15 {
    public static void main(String[] args)
    {
        int number = 6;
  int i = number, j;
        // Nested while loops
        // Outer loop
  
        // Till condition holds true
        while (i > 0) {
            j = 0;
  
            // Inner loop
            // Condition check
			while (j++ < number - i) {
                // Print whitespaces
                System.out.print(" ");
            }
  
            j = 0;
  
            // Inner loop
            // Condition check
            while (j++< i  ) {
                // Print star
                System.out.print(j+" ");
            }
            System.out.println();
            i--;
        }
    }
}