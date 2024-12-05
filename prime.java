class prime {
    public void findPrime(int num) {
        int flag = 0;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a Prime");
        } else {
            for (int i = 2; i <num; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(num + " is not a Prime");
            } else {
                System.out.println(num + " is Prime");
            }
        }
    }

    public static void main(String args[]) {
        prime prime = new prime();
        prime.findPrime(1);
        prime.findPrime(3);
        prime.findPrime(20);
        prime.findPrime(17);
    }
}
