/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campo;
    private Person persona;
    private Person persona2;
    private Person persona3;
    private Person persona4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();        
        
        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-400);
        campo.moveVertical(100);
        campo.changeSize(1000);
        campo.makeVisible();            
      
      
    }
    
    public void moveSun()
    {
        if (sun != null)    // only if it´s painted already...
        {
            sun.slowMoveVertical(80);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            
        }
            
         
    }
    
    public void personMoving()
    {
        {
            persona = new Person();
            persona.makeVisible();          
            persona.moveHorizontal(-200);
            persona.slowMoveHorizontal(50);
        }
    }
    
    public void morePeople()
    {
        {
            persona2 = new Person();
            persona3 = new Person();
            persona4 = new Person();
            persona2.makeVisible();          
            persona2.moveVertical(70);
            persona2.moveHorizontal(70);
            persona3.makeVisible();          
            persona3.moveVertical(70);
            persona4.makeVisible();          
            persona4.moveHorizontal(100);            
        }
    }
    
    public void peopleMovig()
    {
        if (persona2 != null && persona3 != null && persona4 != null)
        {
            persona2.slowMoveVertical(30);
            persona3.slowMoveVertical(30);
            persona4.slowMoveHorizontal(30);
        }
    }
    
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
