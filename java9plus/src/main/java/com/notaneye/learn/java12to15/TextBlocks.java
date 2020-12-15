package com.notaneye.learn.java12to15;


public class TextBlocks {

    public static void main(String[] args) {

        var s = """
                Look ma! I'm a text block!
                Start with triple-quotes, then a newline. Everything after that
                up to the closing triple-quotes is part of the block.
                
                These lines are aligned with the first.
                    But this line is indented 4 spaces.
                                
                \t\t\t\t<- Some tabs
                                
                Every newline is significant. If the terminating quotes are on
                their own line, a trailing line break will be generated.
                
                The exception to this is the '\\' character at the end of the \
                line, which will suppress the newline found in the source code.
                
                Text blocks can also use the '\\s' escape, which will insert a
                literal space. When used at the end of a line, it will prevent
                the compiler from stripping trailing spaces:
                Spades   \s
                Diamonds \s
                Clubs    \s
                Hearts   \s""";
        System.out.println(s);
    }
}
