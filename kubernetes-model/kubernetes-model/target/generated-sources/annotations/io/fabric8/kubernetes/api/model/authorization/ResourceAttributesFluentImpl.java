package io.fabric8.kubernetes.api.model.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class ResourceAttributesFluentImpl<A extends ResourceAttributesFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ResourceAttributesFluent<A>{

    private String group;
    private String name;
    private String namespace;
    private String resource;
    private String subresource;
    private String verb;
    private String version;

    public ResourceAttributesFluentImpl(){
    }
    public ResourceAttributesFluentImpl(ResourceAttributes instance){
            this.withGroup(instance.getGroup()); 
            this.withName(instance.getName()); 
            this.withNamespace(instance.getNamespace()); 
            this.withResource(instance.getResource()); 
            this.withSubresource(instance.getSubresource()); 
            this.withVerb(instance.getVerb()); 
            this.withVersion(instance.getVersion()); 
    }

    public String getGroup(){
            return this.group;
    }

    public A withGroup(String group){
            this.group=group; return (A) this;
    }

    public Boolean hasGroup(){
            return this.group != null;
    }

    public String getName(){
            return this.name;
    }

    public A withName(String name){
            this.name=name; return (A) this;
    }

    public Boolean hasName(){
            return this.name != null;
    }

    public String getNamespace(){
            return this.namespace;
    }

    public A withNamespace(String namespace){
            this.namespace=namespace; return (A) this;
    }

    public Boolean hasNamespace(){
            return this.namespace != null;
    }

    public String getResource(){
            return this.resource;
    }

    public A withResource(String resource){
            this.resource=resource; return (A) this;
    }

    public Boolean hasResource(){
            return this.resource != null;
    }

    public String getSubresource(){
            return this.subresource;
    }

    public A withSubresource(String subresource){
            this.subresource=subresource; return (A) this;
    }

    public Boolean hasSubresource(){
            return this.subresource != null;
    }

    public String getVerb(){
            return this.verb;
    }

    public A withVerb(String verb){
            this.verb=verb; return (A) this;
    }

    public Boolean hasVerb(){
            return this.verb != null;
    }

    public String getVersion(){
            return this.version;
    }

    public A withVersion(String version){
            this.version=version; return (A) this;
    }

    public Boolean hasVersion(){
            return this.version != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ResourceAttributesFluentImpl that = (ResourceAttributesFluentImpl) o;
            if (group != null ? !group.equals(that.group) :that.group != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
            if (resource != null ? !resource.equals(that.resource) :that.resource != null) return false;
            if (subresource != null ? !subresource.equals(that.subresource) :that.subresource != null) return false;
            if (verb != null ? !verb.equals(that.verb) :that.verb != null) return false;
            if (version != null ? !version.equals(that.version) :that.version != null) return false;
            return true;
    }




}
