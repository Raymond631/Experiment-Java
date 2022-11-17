public class Test3 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*52+1);
        int size = num%13;  //大小
        int color = num/13;  //花色
        switch (color)
        {
            case 0:
                if (size==1)
                    System.out.println("Spades Ace");
                else if (size==11)
                    System.out.println("Spades Jack");
                else if (size==12)
                    System.out.println("Spades Queen");
                else if (size==0)
                    System.out.println("Spades King");
                else
                    System.out.println("Spades "+size);
                break;
            case 1:
                if (size==1)
                    System.out.println("Heart Ace");
                else if (size==11)
                    System.out.println("Heart Jack");
                else if (size==12)
                    System.out.println("Heart Queen");
                else if (size==0)
                    System.out.println("Heart King");
                else
                    System.out.println("Heart "+size);
                break;
            case 2:
                if (size==1)
                    System.out.println("Clubs Ace");
                else if (size==11)
                    System.out.println("Clubs Jack");
                else if (size==12)
                    System.out.println("Clubs Queen");
                else if (size==0)
                    System.out.println("Clubs King");
                else
                    System.out.println("Clubs "+size);
                break;
            case 3:
                if (size==1)
                    System.out.println("Diamond Ace");
                else if (size==11)
                    System.out.println("Diamond Jack");
                else if (size==12)
                    System.out.println("Diamond Queen");
                else if (size==0)
                    System.out.println("Diamond King");
                else
                    System.out.println("Diamond "+size);
                break;
        }
    }
}
