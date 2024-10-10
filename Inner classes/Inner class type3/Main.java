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
        System.out.println("word is (" + this.word +
                ") and num is "+ this.num);
        class localInClass
        {
            int num = 53;
            String word = "bye there";
            void print()
            {
                System.out.println("word in localInClass is ("
                + word + ") and num is " + this.num);
            }
        }
        localInClass l = new localInClass();
        l.print();
    }
}


public class Main {
    public static void main(String[] args) {
        outClass o = new outClass("hello there", 77);
        o.print();
    }
}
