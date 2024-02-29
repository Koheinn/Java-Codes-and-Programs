package fileinputoutput_demo;
 
import java.io.File;
 
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
 
public class FileChooserDeleteDemo {
 
	public FileChooserDeleteDemo(){
		JFileChooser jf=new JFileChooser();
	    jf.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    int result = jf.showOpenDialog(null);
	    if ( result==JFileChooser.CANCEL_OPTION)
	    	 System.exit( 1 );
	    File fileName = jf.getSelectedFile();
	    if ( ( fileName == null ) || ( fileName.getName().equals( "" )))
	    	 {
	    	 JOptionPane.showMessageDialog( null, "Invalid Name",
	    	 "Invalid Name", JOptionPane.ERROR_MESSAGE );
	    	 System.exit( 1 );
	    	 } // end i
	    else {
	    	boolean flag=fileName.delete();
	    	if(flag) {
	    		JOptionPane.showMessageDialog( null, " Successfully deleted file",
	    		    	 "File Delete Box", JOptionPane.INFORMATION_MESSAGE );
	    	}
	    	else {
	    		JOptionPane.showMessageDialog( null, "Can't delete file",
	    		    	 "File Delete Box ", JOptionPane.ERROR_MESSAGE );
	    	}
	    }
	}
 
	public static void main(String[] args) {
		new FileChooserDeleteDemo();
 
	}
 
}
 
