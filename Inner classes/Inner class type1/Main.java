class outClass{
    int num;
    String word;

    outClass(String word, int num)
    {
        this.word = word;
        this.num = num;
    }
    void print()
    {
        System.out.println("word is ("+this.word + ") and num is " + this.num);
    }
    class inClass
    {
        int inNum;
        String inWord;
        inClass(String inWord, int inNum)
        {
            this.inWord = inWord;
            this.inNum = inNum;
        }
        void print()
        {
            System.out.println("we are in inClass word is (" +
                    this.inWord + ") and num is " + this.inNum);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        outClass o = new outClass("hey there", 77);
        o.print();
        outClass.inClass i = o.new inClass("bye bye", 53);
        i.print();
    }
}
