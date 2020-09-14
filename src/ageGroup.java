import java.util.*;

// QUESTION 1

class ageGroup
{
    public static void Age_calculation(int[] ages){
        int count[]=new int[10];
        for(int i=0;i<ages.length;i++){
            if(ages[i]>=91 && ages[i]<=100){
                count[9]+=1;
            }else if(ages[i]>=81 && ages[i]<=90){
                count[8]+=1;
            }else if(ages[i]>=71 && ages[i]<=80){
                count[7]+=1;
            }else if(ages[i]>=61 && ages[i]<=70){
                count[6]+=1;
            }else if(ages[i]>=51 && ages[i]<=60){
                count[5]+=1;
            }else if(ages[i]>=41 && ages[i]<=50){
                count[4]+=1;
            }else if(ages[i]>=31 && ages[i]<=40){
                count[3]+=1;
            }else if(ages[i]>=21 && ages[i]<=30){
                count[2]+=1;
            }else if(ages[i]>=11 && ages[i]<=20){
                count[1]+=1;
            }else if(ages[i]>=1 && ages[i]<=10){
                count[0]+=1;
            }
        }
        int lowerlimit = 1;
        int upperlimit = 10;
        System.out.println("Age Group   Total umber of people");
        for(int i=0;i<10;i++){
            System.out.format("%d-%d            %d\n",lowerlimit,upperlimit,count[i]);
            lowerlimit+=10;
            upperlimit+=10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Start Entering the array elements");
        int array[] = new int[size];
        for(int i=0;i<size; i++) {
            array[i] = sc.nextInt();
        }
        //int array[]={10,20,30,35,40,45,50};
        Age_calculation(array);
    }
}
