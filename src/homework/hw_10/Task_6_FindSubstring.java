package homework.hw_10;

public class Task_6_FindSubstring {

    public static boolean task_6_FindSubstring(String str){
        return str.contains("Java");
    }

    public static void main(String[] args) {
        System.out.println(task_6_FindSubstring("""
                As of March 2022, Java 18 is the latest version, while Java 17, 11
                and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public
                update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will
                otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors
                have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades."""));

        System.out.println(task_6_FindSubstring("""
                As a decrepit father takes delight
                To see his active child do deeds of youth,
                So I, made lame by fortune’s dearest spite,
                Take all my comfort of thy worth and truth.
                For whether beauty, birth, or wealth, or wit,
                Or any of these all, or all, or more,
                Entitled in thy parts do crownèd sit,
                I make my love engrafted to this store.
                So then I am not lame, poor, nor despised,
                Whilst that this shadow doth such substance give
                That I in thy abundance am sufficed,
                And by a part of all thy glory live.
                Look what is best, that best I wish in thee.
                This wish I have; then ten times happy me."""));
    }
}
