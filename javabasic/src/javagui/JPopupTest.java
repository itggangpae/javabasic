package javagui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class JPopupTest extends JFrame 
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JMenuItem items[];
   public JPopupTest()
   {
      super( "JPopupMenu연습예제" );

      final JPopupMenu popupMenu = new JPopupMenu();
      String str[] = { "하나", "둘", "셋", "넷" };
      items = new JMenuItem[4];

      for ( int i = 0; i < items.length; i++ ) 
	  {         
         items[i] = new JMenuItem(str[ i ]);
         popupMenu.add(items[ i ]);
      }
      addMouseListener
	  (
         new MouseAdapter() {
            public void mousePressed( MouseEvent e )
               { checkForTriggerEvent( e ); } 

            public void mouseReleased( MouseEvent e )
               { checkForTriggerEvent( e ); } 

            public void checkForTriggerEvent( MouseEvent e ){
               if ( e.isPopupTrigger() ) 
                  popupMenu.show( e.getComponent(), e.getX(), e.getY() );               
            }
         }
      );    
      setSize( 300, 200 );
      setVisible(true);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
}
