import java.util.*;
class TrafficLight
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sum=0;
       System.out.print("Enert the number of signals :");
       int signal=sc.nextInt();
       System.out.print("Does the signal have same time differenbce(y or n) :");
       char timeDiff=sc.next().charAt(0);
        if (timeDiff=='y' || timeDiff=='Y') {
            System.out.print("Enert the time differencr for each signals include the last signal to destination :");
       int signalTimediff=sc.nextInt();
       System.out.print("Does all signals have two ways(y or n) :");
       char sameDiff=sc.next().charAt(0);
            if ((sameDiff=='y'||sameDiff=='Y') &&(timeDiff=='y' || timeDiff=='Y')) {
                System.out.print("Enter the signal time :");
                int signalTime=sc.nextInt();
                int wait=Math.abs(signalTime-Math.abs(signalTimediff-signalTime));
                sum=(signal*signalTimediff)+signalTimediff+(signal*wait);
            }
            else{

            }
        }
        else{
            int []a=new int[signal];
            System.out.print("Does all signals have two ways(y or n) :");
            char sDiff=sc.next().charAt(0);
            if (sDiff=='n'||sDiff=='N') {
                for(int i=0;i<signal;i++){
                    System.out.print("Enter the time to signal "+(i+1)+":");
                    a[i]=sc.nextInt();
                } 
                System.out.print("Enert the time to reach destination : ");
                 int timeDest=sc.nextInt();
                System.out.print("Enter number of paths at signal :");
            int paths=sc.nextInt();
            System.out.print("Enter the signal time :");
            int sgTime=sc.nextInt();
            int waits=0;
            for(int j=0;j<signal;j++){
                sum+=a[j];
                waits = waits+(Math.abs(sgTime-Math.abs(a[j]-sgTime)))+((paths-1)*sgTime);
            }
                sum+=waits+timeDest;
            }
            else{


            }
            
        }
        System.out.println("Total second is : "+sum);
    }
}