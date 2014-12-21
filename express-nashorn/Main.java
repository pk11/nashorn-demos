import com.oracle.avatar.js.Server;
import com.oracle.avatar.js.Server;
import jdk.nashorn.api.scripting.URLReader;

import javax.script.ScriptEngine;
import java.io.File;
import java.lang.reflect.Field;

public class Main {

/* USE THIS IF YOU WANT TO SET java.library.path PROGRAMMATICALLY
  static {
        try {
            final Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
            sysPathsField.setAccessible(true);
            sysPathsField.set(null, null);
            System.setProperty("java.library.path",
                    new File(Main.class.getResource("/libavatar-js.so").getPath())
                            .getParentFile().getCanonicalPath());
            System.loadLibrary("avatar-js");
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
*/
  public static void main(String[] args) throws Throwable {
        Server.main(Main.class.getResource("/app.js").getPath());
    }
}
