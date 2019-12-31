package io.fabric8.kubernetes.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.fabric8.kubernetes.api.builder.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class SELinuxOptionsFluentImpl<A extends SELinuxOptionsFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements SELinuxOptionsFluent<A>{

    private String level;
    private String role;
    private String type;
    private String user;

    public SELinuxOptionsFluentImpl(){
    }
    public SELinuxOptionsFluentImpl(SELinuxOptions instance){
            this.withLevel(instance.getLevel()); 
            this.withRole(instance.getRole()); 
            this.withType(instance.getType()); 
            this.withUser(instance.getUser()); 
    }

    public String getLevel(){
            return this.level;
    }

    public A withLevel(String level){
            this.level=level; return (A) this;
    }

    public Boolean hasLevel(){
            return this.level != null;
    }

    public String getRole(){
            return this.role;
    }

    public A withRole(String role){
            this.role=role; return (A) this;
    }

    public Boolean hasRole(){
            return this.role != null;
    }

    public String getType(){
            return this.type;
    }

    public A withType(String type){
            this.type=type; return (A) this;
    }

    public Boolean hasType(){
            return this.type != null;
    }

    public String getUser(){
            return this.user;
    }

    public A withUser(String user){
            this.user=user; return (A) this;
    }

    public Boolean hasUser(){
            return this.user != null;
    }

    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            SELinuxOptionsFluentImpl that = (SELinuxOptionsFluentImpl) o;
            if (level != null ? !level.equals(that.level) :that.level != null) return false;
            if (role != null ? !role.equals(that.role) :that.role != null) return false;
            if (type != null ? !type.equals(that.type) :that.type != null) return false;
            if (user != null ? !user.equals(that.user) :that.user != null) return false;
            return true;
    }




}
