package com.mrsll.aigou.util;

public class AjaxResult {
    private boolean success=true;
    private String message="操作成功！";
    private Object resultObj;//返回前台对象，给前台传参

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;//用于链式编程，所以返回值类型是一个对象，返回this对象本身，才能使用返回的对象继续调用其他方法
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }
    //AjaxResult.getAjaxResult()成功
    //AjaxResult.getAjaxResult().setMessage()成功
    //AjaxResult.getAjaxResult().setSuccess(false),setMessage("失败");
    public static AjaxResult getAjaxResult(){//获取AjaxResult对象的方法，便于获取对象
        return new AjaxResult();
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}
