package io.fabric8.openshift.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SourceControlUserFluentImpl<A extends SourceControlUserFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SourceControlUserFluent<A>{

    private String email;
    private String name;

    public SourceControlUserFluentImpl(){
    }
    public SourceControlUserFluentImpl(SourceControlUser instance){
            this.withEmail(instance.getEmail()); 
            this.withName(instance.getName()); 
    }

    public String getEmail(){
            return this.email;
    }

    public A withEmail(String email){
            this.email=email; return (A) this;
    }

    public Boolean hasEmail(){
            return this.email != null;
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

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SourceControlUserFluentImpl that = (SourceControlUserFluentImpl) o;
            if (email != null ? !email.equals(that.email) :that.email != null) return false;
            if (name != null ? !name.equals(that.name) :that.name != null) return false;
            return true;
    }




}
