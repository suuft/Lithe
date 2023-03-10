package net.lithe.injectior;

import lombok.NonNull;

// TODO: Auto-Injection to fields, methods, constructor, with: <br>
//  createMethodInjection(UserHelper.class, "getRegisterDate").addArguments("user", user).execute()
//      .parseResult(Date.class);
//
// TODO: For fields:
//  createFieldInjection(user)
//      .injectStatic()
//      .injectInstance()
//      .execute();
public interface Injector {

    /**
     * Getting an instance of the implementation of the specified class. If the type is
     * a prototype, a new instance will be returned.
     *
     * @param t - abstract class.
     * @return - instance of the implementation of the specified class.
     */
    <T> T getInstance(@NonNull Class<T> t);

    /**
     * Creating an instance of a class unregistered in the injector,
     * but into which dependencies must be injected.
     * * May return null, need an empty constructor.
     *
     * @param t - class
     * @return - generated instance
     */
    <T> T createInstance(@NonNull Class<T> t);


    /**
     * It is called automatically (by framemork) to
     * inject dependencies into registered singleton-instances.
     */
    void postInitialize();
}
