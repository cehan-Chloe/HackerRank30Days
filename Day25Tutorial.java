private static void printStats(int count, int n, boolean isPrime){
        String caller = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.err.println( caller + " performed " + count + " checks, determined " + n
        + ( (isPrime) ? " is PRIME." : " is NOT PRIME." ) );
    }
    /**
    *   Worst: O(n) algorithm
    *     Checks if n is divisible by any number from 4 to n.
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeWorst(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }
        
        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < n - 1 ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }
    
    /**
    *   Better: O(n) algorithm
    *    Checks if n is divisible by any number from 2 to n/2,
    *    but is asymptotically the same as isPrimeWorst
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeLessWorst(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < n/2 ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }
    
    /**
    *   O(n^(1/2)) Algorithm
    *    Checks if n is divisible by any number from 2 to sqrt(n).
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeGood(int n){
        int count = 0;
        // 1 is not prime
        if( n == 1 ){
            printStats(++count, n, false);
            return false;
        }
        else if( n == 2 ){
            printStats(++count, n, true);
            return true;
        }

        // return false n is divisible by any i from 2 to n
        int i = 1;
        while( i++ < Math.sqrt(n) ){
            count++;
            if( n % i == 0 ){
                printStats(++count, n, false);
                return false;
            }
        }

        // n is prime
        printStats(++count, n, true);
        return true;
    }

    /**
    *   Improved O( n^(1/2)) ) Algorithm
    *    Checks if n is divisible by 2 or any odd number from 3 to sqrt(n).
    *    The only way to improve on this is to check if n is divisible by 
    *   all KNOWN PRIMES from 2 to sqrt(n).
    *
    *   @param n An integer to be checked for primality.
    *   @return true if n is prime, false if n is not prime.
    **/
    public static boolean isPrimeBest(int n){
        int count = 0;
        // check lower boundaries on primality
        if( n == 2 ){ 
            printStats(++count, n, true);
            return true;
        } // 1 is not prime, even numbers > 2 are not prime
        else if( n == 1 || (n & 1) == 0){
            printStats(++count, n, false);
            return false;
        }

        // Check for primality using odd numbers from 3 to sqrt(n)
        for(int i = 3; i <= Math.sqrt(n); i += 2){
            count++;
            // n is not prime if it is evenly divisible by some 'i' in this range
            if( n % i == 0 ){ 
                printStats(++count, n, false);
                return false;
            }
        }
        // n is prime
        printStats(++count, n, true);
        return true;
    }
