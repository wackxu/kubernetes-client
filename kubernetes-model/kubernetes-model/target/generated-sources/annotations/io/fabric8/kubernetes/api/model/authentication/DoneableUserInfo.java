package io.fabric8.kubernetes.api.model.authentication;

import io.fabric8.kubernetes.api.builder.Function;
import io.fabric8.kubernetes.api.model.Doneable;

public class DoneableUserInfo extends UserInfoFluentImpl<DoneableUserInfo> implements Doneable<UserInfo>{

    private final UserInfoBuilder builder;
    private final io.fabric8.kubernetes.api.builder.Function<UserInfo,UserInfo> function;

    public DoneableUserInfo(io.fabric8.kubernetes.api.builder.Function<UserInfo,UserInfo> function){
            super();this.builder=new UserInfoBuilder(this);this.function=function;
    }
    public DoneableUserInfo(UserInfo item,io.fabric8.kubernetes.api.builder.Function<UserInfo,UserInfo> function){
            super(item);this.builder=new UserInfoBuilder(this, item);this.function=function;
    }
    public DoneableUserInfo(UserInfo item){
            super(item);this.builder=new UserInfoBuilder(this, item);this.function=new Function<UserInfo, UserInfo>() {
    public UserInfo apply(UserInfo item) {
        return item;
    }
}
;
    }

    public UserInfo done(){
             return function.apply(builder.build());
    }




}
