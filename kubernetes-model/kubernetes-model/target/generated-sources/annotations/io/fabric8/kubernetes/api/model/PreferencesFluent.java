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

public interface PreferencesFluent<A extends PreferencesFluent<A>> extends Fluent<A>{


    public Boolean isColors();
    public A withColors(Boolean colors);
    public Boolean hasColors();
    public A withNewColors(String arg1);
    public A withNewColors(boolean arg1);
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
    public PreferencesFluent.ExtensionsNested<A> addNewExtension();
    public PreferencesFluent.ExtensionsNested<A> addNewExtensionLike(NamedExtension item);
    public PreferencesFluent.ExtensionsNested<A> setNewExtensionLike(int index,NamedExtension item);
    public PreferencesFluent.ExtensionsNested<A> editExtension(int index);
    public PreferencesFluent.ExtensionsNested<A> editFirstExtension();
    public PreferencesFluent.ExtensionsNested<A> editLastExtension();
    public PreferencesFluent.ExtensionsNested<A> editMatchingExtension(io.fabric8.kubernetes.api.builder.Predicate<NamedExtensionBuilder> predicate);

    public interface ExtensionsNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,NamedExtensionFluent<PreferencesFluent.ExtensionsNested<N>>{

        
    public N and();    public N endExtension();
}


}
