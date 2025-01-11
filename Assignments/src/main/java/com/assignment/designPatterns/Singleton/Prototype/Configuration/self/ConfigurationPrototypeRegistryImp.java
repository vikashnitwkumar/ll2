package main.java.com.assignment.designPatterns.Singleton.Prototype.Configuration.self;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationPrototypeRegistryImp implements ConfigurationPrototypeRegistry{
    private Map<ConfigurationType, Configuration> registry = new HashMap<>();
    @Override
    public void addPrototype(Configuration configuration) {
        registry.put(configuration.getType(), configuration);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.getOrDefault(type,null);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
       if(registry.containsKey(type)) return (Configuration) registry.get(type).cloneObject();
       return null;
    }
}
