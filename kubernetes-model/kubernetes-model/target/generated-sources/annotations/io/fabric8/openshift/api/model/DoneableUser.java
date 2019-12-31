package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableUser extends UserFluentImpl<DoneableUser> implements Doneable<User>{

    private final UserBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<User,User> function;

    public DoneableUser(io.fabric8.kubernetes.api.builder.Function<User,User> function){
            super();this.builder=new UserBuilder(this);this.function=function;
    }
    public DoneableUser(User item,io.fabric8.kubernetes.api.builder.Function<User,User> function){
            super(item);this.builder=new UserBuilder(this, item);this.function=function;
    }
    public DoneableUser(User item){
            super(item);this.builder=new UserBuilder(this, item);this.function=new Function<User, User>() {
    public User apply(User item) {
        return item;
    }
}
;
    }

    public User done(){
             return function.apply(builder.build());
    }




}
