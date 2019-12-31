package io.fabric8.kubernetes.api.model.apps;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableRollingUpdateDaemonSet extends RollingUpdateDaemonSetFluentImpl<DoneableRollingUpdateDaemonSet> implements Doneable<RollingUpdateDaemonSet>{

    private final RollingUpdateDaemonSetBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<RollingUpdateDaemonSet,RollingUpdateDaemonSet> function;

    public DoneableRollingUpdateDaemonSet(io.fabric8.kubernetes.api.builder.Function<RollingUpdateDaemonSet,RollingUpdateDaemonSet> function){
            super();this.builder=new RollingUpdateDaemonSetBuilder(this);this.function=function;
    }
    public DoneableRollingUpdateDaemonSet(RollingUpdateDaemonSet item,io.fabric8.kubernetes.api.builder.Function<RollingUpdateDaemonSet,RollingUpdateDaemonSet> function){
            super(item);this.builder=new RollingUpdateDaemonSetBuilder(this, item);this.function=function;
    }
    public DoneableRollingUpdateDaemonSet(RollingUpdateDaemonSet item){
            super(item);this.builder=new RollingUpdateDaemonSetBuilder(this, item);this.function=new Function<RollingUpdateDaemonSet, RollingUpdateDaemonSet>() {
    public RollingUpdateDaemonSet apply(RollingUpdateDaemonSet item) {
        return item;
    }
}
;
    }

    public RollingUpdateDaemonSet done(){
             return function.apply(builder.build());
    }




}
