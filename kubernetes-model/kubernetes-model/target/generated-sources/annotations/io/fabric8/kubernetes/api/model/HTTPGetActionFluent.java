package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.fabric8.kubernetes.api.builder.Nested;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.lang.String;
import com.fasterxml.jackson.databind.JsonDeserializer;
import io.fabric8.kubernetes.api.builder.Predicate;
import java.lang.Deprecated;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.util.List;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.lang.Boolean;
import java.lang.Override;
import com.fasterxml.jackson.core.JsonParser;
import io.fabric8.kubernetes.api.builder.Fluent;
import java.lang.Integer;
import javax.validation.Valid;
import java.util.Collection;
import java.lang.Object;
import java.util.Map;

public interface HTTPGetActionFluent<A extends HTTPGetActionFluent<A>> extends Fluent<A>{


    public String getHost();
    public A withHost(String host);
    public Boolean hasHost();
    public A addToHttpHeaders(int index,HTTPHeader item);
    public A setToHttpHeaders(int index,HTTPHeader item);
    public A addToHttpHeaders(HTTPHeader... items);
    public A addAllToHttpHeaders(Collection<HTTPHeader> items);
    public A removeFromHttpHeaders(HTTPHeader... items);
    public A removeAllFromHttpHeaders(Collection<HTTPHeader> items);
    
/**
 * This method has been deprecated, please use method buildHttpHeaders instead.
 * @return The buildable object.
 */
@Deprecated public List<HTTPHeader> getHttpHeaders();
    public List<HTTPHeader> buildHttpHeaders();
    public HTTPHeader buildHttpHeader(int index);
    public HTTPHeader buildFirstHttpHeader();
    public HTTPHeader buildLastHttpHeader();
    public HTTPHeader buildMatchingHttpHeader(io.fabric8.kubernetes.api.builder.Predicate<HTTPHeaderBuilder> predicate);
    public A withHttpHeaders(List<HTTPHeader> httpHeaders);
    public A withHttpHeaders(HTTPHeader... httpHeaders);
    public Boolean hasHttpHeaders();
    public A addNewHttpHeader(String name,String value);
    public HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeader();
    public HTTPGetActionFluent.HttpHeadersNested<A> addNewHttpHeaderLike(HTTPHeader item);
    public HTTPGetActionFluent.HttpHeadersNested<A> setNewHttpHeaderLike(int index,HTTPHeader item);
    public HTTPGetActionFluent.HttpHeadersNested<A> editHttpHeader(int index);
    public HTTPGetActionFluent.HttpHeadersNested<A> editFirstHttpHeader();
    public HTTPGetActionFluent.HttpHeadersNested<A> editLastHttpHeader();
    public HTTPGetActionFluent.HttpHeadersNested<A> editMatchingHttpHeader(io.fabric8.kubernetes.api.builder.Predicate<HTTPHeaderBuilder> predicate);
    public String getPath();
    public A withPath(String path);
    public Boolean hasPath();
    
/**
 * This method has been deprecated, please use method buildPort instead.
 * @return The buildable object.
 */
@Deprecated public IntOrString getPort();
    public IntOrString buildPort();
    public A withPort(IntOrString port);
    public Boolean hasPort();
    public A withNewPort(String strVal);
    public A withNewPort(Integer intVal);
    public HTTPGetActionFluent.PortNested<A> withNewPort();
    public HTTPGetActionFluent.PortNested<A> withNewPortLike(IntOrString item);
    public HTTPGetActionFluent.PortNested<A> editPort();
    public HTTPGetActionFluent.PortNested<A> editOrNewPort();
    public HTTPGetActionFluent.PortNested<A> editOrNewPortLike(IntOrString item);
    public String getScheme();
    public A withScheme(String scheme);
    public Boolean hasScheme();

    public interface HttpHeadersNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,HTTPHeaderFluent<HTTPGetActionFluent.HttpHeadersNested<N>>{

        
    public N and();    public N endHttpHeader();
}
    public interface PortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>,IntOrStringFluent<HTTPGetActionFluent.PortNested<N>>{

        
    public N and();    public N endPort();
}


}
