package io.fabric8.kubernetes.api.model;

import io.fabric8.kubernetes.api.builder.Function;

public class DoneableAWSElasticBlockStoreVolumeSource extends AWSElasticBlockStoreVolumeSourceFluentImpl<DoneableAWSElasticBlockStoreVolumeSource> implements Doneable<AWSElasticBlockStoreVolumeSource>{

    private final AWSElasticBlockStoreVolumeSourceBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<AWSElasticBlockStoreVolumeSource,AWSElasticBlockStoreVolumeSource> function;

    public DoneableAWSElasticBlockStoreVolumeSource(io.fabric8.kubernetes.api.builder.Function<AWSElasticBlockStoreVolumeSource,AWSElasticBlockStoreVolumeSource> function){
            super();this.builder=new AWSElasticBlockStoreVolumeSourceBuilder(this);this.function=function;
    }
    public DoneableAWSElasticBlockStoreVolumeSource(AWSElasticBlockStoreVolumeSource item,io.fabric8.kubernetes.api.builder.Function<AWSElasticBlockStoreVolumeSource,AWSElasticBlockStoreVolumeSource> function){
            super(item);this.builder=new AWSElasticBlockStoreVolumeSourceBuilder(this, item);this.function=function;
    }
    public DoneableAWSElasticBlockStoreVolumeSource(AWSElasticBlockStoreVolumeSource item){
            super(item);this.builder=new AWSElasticBlockStoreVolumeSourceBuilder(this, item);this.function=new Function<AWSElasticBlockStoreVolumeSource, AWSElasticBlockStoreVolumeSource>() {
    public AWSElasticBlockStoreVolumeSource apply(AWSElasticBlockStoreVolumeSource item) {
        return item;
    }
}
;
    }

    public AWSElasticBlockStoreVolumeSource done(){
             return function.apply(builder.build());
    }




}
