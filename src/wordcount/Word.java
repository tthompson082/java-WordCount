package wordcount;

public class Word 
{
    // fields
    private String word;
    private int count;

    // constructor
    public Word(String word, int count)
    {
        this.word = word;
        this.count = count;
    }

    // getters and setters

    public String getWord()
    {
        return word;
    }

    public void setWord(String word)
    {
        this.word = word;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }
}