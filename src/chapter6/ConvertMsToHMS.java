package chapter6;

public class ConvertMsToHMS
{
    public static void main(String[] args)
    {
        System.out.println(convertMillis(555550000));
    }

    /**
     * Converts milliseconds into a string
     * representing hours:minutes:seconds
     * @param millis number of milliseconds
     * @return string in HH:MM:SS format
     */
    public static String convertMillis(long millis)
    {
        long totalSeconds = millis / 1000;
        long hours = totalSeconds / 3600;
        long remainingSeconds = totalSeconds % 3600;
        long minutes = remainingSeconds / 60;
        remainingSeconds %= 60;
        long seconds = remainingSeconds;

        return hours + ":" + minutes + ":" + seconds;
    }
}
