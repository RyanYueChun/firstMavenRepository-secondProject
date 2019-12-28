package com.secondcompany.app;

import com.mycompany.app.App;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        // Create an instance of the class from the first project so that we can use it's methods here
        App firstApp = new App();

        System.out.println( firstApp.getMessage() );
    }
}
