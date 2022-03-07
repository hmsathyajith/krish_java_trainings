import java.util.Scanner;

public class VikysProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How far do you want to jump the frog?");
        int distance = sc.nextInt();
        int time = 0;
        int count = 0;
        //System.out.println(distance);

        while (distance > 0) {
            if(distance - 5 >= 0){
                time += 1;
                //System.out.println("line 1 :" + time + " " + distance);
                distance -= 5;
                //System.out.println("line 2 :"+ time + " " + distance);
                if(distance - 3 >= 0){
                    time += 2;
                    distance -= 3;
                    //System.out.println("line 3 :"+ time + " " + distance);
                    if(distance - 1 >= 0){
                        time += 3;
                        distance -= 1;
                        //System.out.println("line 4 :"+ time + " " + distance);
                    }else {
                        break;
                    }
                }else{
                    break;
                }
            }else {
                break;
            }
        }
        System.out.println("the time taken to jump is " + time + " seconds");
//testing
    }
}
