package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableOpenshiftClusterRoleScopeRestriction extends OpenshiftClusterRoleScopeRestrictionFluentImpl<DoneableOpenshiftClusterRoleScopeRestriction> implements Doneable<OpenshiftClusterRoleScopeRestriction>{

    private final OpenshiftClusterRoleScopeRestrictionBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleScopeRestriction,OpenshiftClusterRoleScopeRestriction> function;

    public DoneableOpenshiftClusterRoleScopeRestriction(io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleScopeRestriction,OpenshiftClusterRoleScopeRestriction> function){
            super();this.builder=new OpenshiftClusterRoleScopeRestrictionBuilder(this);this.function=function;
    }
    public DoneableOpenshiftClusterRoleScopeRestriction(OpenshiftClusterRoleScopeRestriction item,io.fabric8.kubernetes.api.builder.Function<OpenshiftClusterRoleScopeRestriction,OpenshiftClusterRoleScopeRestriction> function){
            super(item);this.builder=new OpenshiftClusterRoleScopeRestrictionBuilder(this, item);this.function=function;
    }
    public DoneableOpenshiftClusterRoleScopeRestriction(OpenshiftClusterRoleScopeRestriction item){
            super(item);this.builder=new OpenshiftClusterRoleScopeRestrictionBuilder(this, item);this.function=new Function<OpenshiftClusterRoleScopeRestriction, OpenshiftClusterRoleScopeRestriction>() {
    public OpenshiftClusterRoleScopeRestriction apply(OpenshiftClusterRoleScopeRestriction item) {
        return item;
    }
}
;
    }

    public OpenshiftClusterRoleScopeRestriction done(){
             return function.apply(builder.build());
    }




}
