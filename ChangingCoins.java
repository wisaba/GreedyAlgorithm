public class ChangingCoins {
    int half=50,quarter=25,dime=10,nicked=5,cent=1, amount,count=0;

    public ChangingCoins(int amountOwed){
        amount = amountOwed;
        while(amount>=half){
            amount-=half;
            count++;
        }
        System.out.println("half " + count);
        count=0;
        while((amount-quarter)>=0){
            amount-=quarter;
            count++;
        }
        System.out.println("quarter " + count);
        count=0;
        while((amount-dime)>=0){
            amount-=dime;
            count++;
        }
        System.out.println("dime " + count);
        count=0;
        while((amount-nicked)>=0){
            amount-=nicked;
            count++;
        }
        System.out.println("nicked " + count);
        count=0;
        while((amount-cent)>=0){
            amount-=cent;
            count++;
        }
        System.out.println("cent " + count +" "+amount);

    }





}
