class Demo {

    static void checkNumber(int num) throws Exception {

        if (num < 0) {
            throw new Exception("Number is negative");
        } else {
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {

        try {   

            checkNumber(-5);  

            int result = 10 / 0;  
        } 
        
        catch (ArithmeticException e)
 {  
            System.out.println("Cannot divide by zero");
        } 
        
        catch (Exception e) {   
            System.out.println("Exception: " + e.getMessage());
        } 
        
        finally {   
            System.out.println("Finally block always executes");
        }
    }
}