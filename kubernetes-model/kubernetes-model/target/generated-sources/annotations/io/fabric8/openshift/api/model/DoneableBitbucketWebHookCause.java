package io.fabric8.openshift.api.model;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableBitbucketWebHookCause extends BitbucketWebHookCauseFluentImpl<DoneableBitbucketWebHookCause> implements Doneable<BitbucketWebHookCause>{

    private final BitbucketWebHookCauseBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<BitbucketWebHookCause,BitbucketWebHookCause> function;

    public DoneableBitbucketWebHookCause(io.fabric8.kubernetes.api.builder.Function<BitbucketWebHookCause,BitbucketWebHookCause> function){
            super();this.builder=new BitbucketWebHookCauseBuilder(this);this.function=function;
    }
    public DoneableBitbucketWebHookCause(BitbucketWebHookCause item,io.fabric8.kubernetes.api.builder.Function<BitbucketWebHookCause,BitbucketWebHookCause> function){
            super(item);this.builder=new BitbucketWebHookCauseBuilder(this, item);this.function=function;
    }
    public DoneableBitbucketWebHookCause(BitbucketWebHookCause item){
            super(item);this.builder=new BitbucketWebHookCauseBuilder(this, item);this.function=new Function<BitbucketWebHookCause, BitbucketWebHookCause>() {
    public BitbucketWebHookCause apply(BitbucketWebHookCause item) {
        return item;
    }
}
;
    }

    public BitbucketWebHookCause done(){
             return function.apply(builder.build());
    }




}
