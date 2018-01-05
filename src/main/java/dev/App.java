package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
    	 String asciiArt = FigletFont.convertOneLine("premier projet maven");
    	    System.out.println(asciiArt);
        System.out.println( "Hello World!" );
    }
}
