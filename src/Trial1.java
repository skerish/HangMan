
public class Trial1 {

    public int[] Array() {

        int[] numb = {1,2,3,5,6};

        for(int i=4;i>2;i--)
        {
            numb[i] = numb[i-1];
        }

        numb[2] = 22;

//        for(int i=0;i<5;i++)
//        {
//            System.out.println(numb[i]);
//        }
        return numb;
    }

}
