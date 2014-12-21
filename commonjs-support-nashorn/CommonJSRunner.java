import javax.script.*;

public class CommonJSRunner {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String scriptName = args[0];
        Bindings bindings = nashorn.createBindings();
        bindings.put("scriptFileName", scriptName);
        bindings.put("scriptFileName", "jvm-npm.js");
        nashorn.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
        nashorn.eval("load('jvm-npm.js')");
        nashorn.eval("load('"+ scriptName +"')");
    }
}    
