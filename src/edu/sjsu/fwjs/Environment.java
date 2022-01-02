package edu.sjsu.fwjs;

import java.util.Map;
import java.util.HashMap;

public class Environment {
    private Map<String,Value> env = new HashMap<String,Value>();
    private Environment outerEnv;

    /**
     * Constructor for global environment
     */
    public Environment() {}

    /**
     * Constructor for local environment of a function
     */
    public Environment(Environment outerEnv) {
        this.outerEnv = outerEnv;
    }

    /**
     * Handles the logic of resolving a variable.
     * If the variable name is in the current scope, it is returned.
     * Otherwise, search for the variable in the outer scope.
     * If we are at the outermost scope (AKA the global scope)
     * null is returned (similar to how JS returns undefined.
     */
    public Value resolveVar(String varName) {
        Environment currentEnvironment = new Environment(this);
        
        // Checking if we have not reached the global scope yet and if the variable is undefined in the current environment.
        while ((currentEnvironment.getOuterEnvironment() != null) && ((currentEnvironment.env.get(varName)) == null))
        {
        	// Updates the current scope to the next outer scope.
        	currentEnvironment = currentEnvironment.getOuterEnvironment();
        }
        
        // We are at the outermost scope, and the variable couldn't be found.
        if (currentEnvironment.env.get(varName) == null)
        {
        	// Return null.
        	return new NullVal();
        }
        
        else
        {
        	// The variable name is in the current scope, so it is returned.
        	return currentEnvironment.env.get(varName);
        }
    }


    /**
     * Used for updating existing variables.
     * If a variable has not been defined previously in the current scope,
     * or any of the function's outer scopes, the var is stored in the global scope.
     */
    public void updateVar(String key, Value v) {
        Environment currentEnvironment = new Environment(this);
        
        // Checking if we have not reached the global scope yet and if the variable has not been defined previously in the current scope.
        while ((currentEnvironment.getOuterEnvironment() != null) && (currentEnvironment.env.get(key) == null))
        {
        	// Updates the current scope to the next outer scope.
        	currentEnvironment = currentEnvironment.getOuterEnvironment();
        }
        
        // Stores variable in the global scope.
        currentEnvironment.env.put(key, v);
    }

    /**
     * Creates a new variable in the local scope.
     * If the variable has been defined in the current scope previously,
     * a RuntimeException is thrown.
     */
    public void createVar(String key, Value v) {
    	// The variable has been defined in the current scope previously.
        if (env.containsKey(key))
        {
        	// A RuntimeException is thrown.
        	throw new RuntimeException("Variable already exists.");
        }
        
        else
        {
        	// Creates a new variable in the local scope.
        	env.put(key, v);
        }
    }
    
    /**
     * Gets the outer environment.
     */
    public Environment getOuterEnvironment() {
        return outerEnv;
    }
}
