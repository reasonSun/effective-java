package chapter6.item36;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class Text {
//    public static final int STYLE_BOLD = 1 << 0;        	//==0001  = 1
//    public static final int STYLE_ITALIC = 1 << 1;			//==0010  = 2
//    public static final int STYLE_UNDERLINE = 1 << 2;		//==0100  = 4
//    public static final int STYLE_STRIKETHROUGH = 1 << 3;	//==1000  = 8
//
//    public void applyStyles(int styles) {
//        System.out.printf("Applying styles %s to text%n",
//                Objects.requireNonNull(styles));
//    }
//
//    public static void main(String[] args) {
//        Text text = new Text();
//        text.applyStyles(STYLE_BOLD | STYLE_ITALIC);
//    }

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // 어떤 Set을 넘겨도 되나, EnumSet이 가장 좋다.
    public void applyStyles(Set<Style> styles) {
        System.out.printf("Applying styles %s to text%n",
                Objects.requireNonNull(styles));
    }

    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
