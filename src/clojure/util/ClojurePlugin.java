package clojure.util;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import clojure.lang.RT;


public class ClojurePlugin extends Plugin {

	static private ClojurePlugin plugin;
	
	public ClojurePlugin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClojurePlugin(IPluginDescriptor descriptor) {
		super(descriptor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		super.start(context);
		plugin = this;
		Class.forName("clojure.lang.RT");
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		super.stop(context);
		plugin = null;
	}

	static public ClojurePlugin getDefault() {
		return plugin;
	}
	
    public String binPath() {
        URL bpath = getBundle().getEntry("/");
        URL rpath;
        try {
            rpath = FileLocator.resolve(bpath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        String base = rpath.getPath() + "bin/";
        return base;
    }
    
}
