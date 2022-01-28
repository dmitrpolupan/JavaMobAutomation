public class MainClass
{
    final private int class_number = 20;
    final private String class_string = "Hello, world";

    public int getLocalNumber()
    {
        return 14;
    }

    public int getClassNumber()
    {
        return class_number;
    }

    public String getClassString()
    {
        return class_string;
    }

    public static boolean containsWords(String inputString, String[] items)
    {
        boolean found = false;
        for (String item : items) {
            if (inputString.contains(item)) {
                found = true;
                break;
            }
        }
        return found;
    }
}
