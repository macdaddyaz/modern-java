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
                their own line, a trailing line break will be generated.""";
        System.out.println(s);
    }
}
