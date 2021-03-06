package com.dyz.pget.util;

/**
 * Created by daiyongzhi on 2019/12/4.
 */
public class ParamCheckUtil {

    public static void check(Class[] paramTypes, Object... args){
        if(paramTypes == null || paramTypes.length < 1){
            if(args == null || args.length < 1){
                return;
            }else{
                throw new RuntimeException("实际传参与BizData配置的参数不符");
            }
        }else{//指定的参数不为空
            if(args == null || args.length < 1){//实际参数为空
                throw new RuntimeException("参数不能为空");
            }
            if(paramTypes.length != args.length){
                throw new RuntimeException("实际传参与BizData配置的参数数量不一致");
            }
            for(int i=0;i<paramTypes.length;i++){
                Class type = paramTypes[i];
                if(type.isPrimitive()){
                    type = ClassUtil.convert2PackageType(type);
                }
                if(!type.isAssignableFrom(args[i].getClass())){
                    throw new RuntimeException("实际传参与BizData配置的参数类型不一致");
                }
            }
        }

    }


}
