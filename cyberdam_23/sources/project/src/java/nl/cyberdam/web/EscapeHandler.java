package nl.cyberdam.web;

import java.io.IOException;
import java.io.Writer;
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

public class EscapeHandler implements CharacterEscapeHandler {

    public void escape( char[] buf, int start, int len, boolean isAttValue, Writer out ) throws IOException {
        for( int i=start; i<start+len; i++ ) {           
            out.write(buf[i]);
        }
    }
}
