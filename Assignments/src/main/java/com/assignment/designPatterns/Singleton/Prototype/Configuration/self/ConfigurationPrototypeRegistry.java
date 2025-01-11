package main.java.com.assignment.designPatterns.Singleton.Prototype.Configuration.self;

public interface ConfigurationPrototypeRegistry {


    void addPrototype(Configuration configuration);

    Configuration getPrototype(ConfigurationType type);

    Configuration clone(ConfigurationType type);
}
