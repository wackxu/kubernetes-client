package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import java.lang.String;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.Boolean;
import java.util.Map;

public interface ContextFluent<A extends ContextFluent<A>> extends Fluent<A>{


    public String getCluster();
    public A withCluster(String cluster);
    public Boolean hasCluster();
    public A addToExtensions(int index,NamedExtension item);
    public A setToExtensions(int index,NamedExtension item);
    public A addToExtensions(NamedExtension... items);
    public A addAllToExtensions(Collection<NamedExtension> items);
    public A removeFromExtensions(NamedExtension... items);
    public A removeAllFromExtensions(Collection<NamedExtension> items);
    
/**
 * This method has been deprecated, please use method buildExtensions instead.
 * @return The buildable object.
 */
@Deprecated public List<NamedExtension> getExtensions();
    public List<NamedExtension> buildExtensions();
    public NamedExtension buildExtension(int index);
    public NamedExtension buildFirstExtension();
    public NamedExtension buildLastExtension();
    public NamedExtension buildMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public A withExtensions(List<NamedExtension> extensions);
    public A withExtensions(NamedExtension... extensions);
    public Boolean hasExtensions();
    public ContextFluent.ExtensionsNested<A> addNewExtension();
    public ContextFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item);
    public ContextFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item);
    public ContextFluent.ExtensionsNested<A> editExtension(int index);
    public ContextFluent.ExtensionsNested<A> editFirstExtension();
    public ContextFluent.ExtensionsNested<A> editLastExtension();
    public ContextFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);
    public String getNamespace();
    public A withNamespace(String namespace);
    public Boolean hasNamespace();
    public String getUser();
    public A withUser(String user);
    public Boolean hasUser();

    public interface ExtensionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<ContextFluent.ExtensionsNested<N>>{

        
    public N and();    public N endExtension();
}


}
