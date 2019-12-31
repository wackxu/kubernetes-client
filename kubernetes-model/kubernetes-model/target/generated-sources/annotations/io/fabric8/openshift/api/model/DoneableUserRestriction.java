package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableUserRestriction extends UserRestrictionFluentImpl<DoneableUserRestriction> implements Doneable<UserRestriction>{

    private final UserRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<UserRestriction,UserRestriction> function;

    public DoneableUserRestriction(io.fabric8.kubernetes.api.builder.Function<UserRestriction,UserRestriction> function){
            super();this.builder=new UserRestrictionBuilder(this);this.function=function;
    }
    public DoneableUserRestriction(UserRestriction item,io.fabric8.kubernetes.api.builder.Function<UserRestriction,UserRestriction> function){
            super(item);this.builder=new UserRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableUserRestriction(UserRestriction item){
            super(item);this.builder=new UserRestrictionBuilder(this, item);this.function=new Function<UserRestriction, UserRestriction>() {
    public UserRestriction apply(UserRestriction item) {
        return item;
    }
}
;
    }

    public UserRestriction done(){
             return function.apply(builder.build());
    }




}
