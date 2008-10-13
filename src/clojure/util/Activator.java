package clojure.util;

import org.eclipse.core.runtime.IPluginDescriptor;
import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

import clojure.lang.RT;


public class Activator extends Plugin {

	static private Activator plugin;
	
	public Activator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Activator(IPluginDescriptor descriptor) {
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

	static public Activator getDefault() {
		return plugin;
	}
	
}
