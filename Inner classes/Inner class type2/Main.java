class outClass
{
    int num;
    String word;
    outClass(String word, int num)
    {
        this.word = word;
        this.num = num;
    }
    void print()
    {
        System.out.println("word in outClass is (" + this.word +
                ") and num is "+ this.num);
    }

    static class inClass
    {
        int num;
        String word;
        inClass(String word, int num)
        {
            this.word = word;
            this.num = num;
        }
        void print()
        {
            System.out.println("word in inClass is ("+ this.word
                    + ") and num is " + this.num);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        outClass o = new outClass("hello there", 77);
        outClass.inClass i = new outClass.inClass("bye there", 53);
        o.print();
        i.print();
    }
}
