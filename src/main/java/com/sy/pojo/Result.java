package com.sy.pojo;

import java.io.Serializable;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 自定义响应结构
 * @Description: 用于响应结果封装
 *
 * @version: v1.0.0
 * @author: guoxinming
 * @date: 2017年11月30日 下午10:53:04
 */
public class Result implements Serializable{

    /**  
	  * @Fields serialVersionUID
	  */   
	private static final long serialVersionUID = 2325646055961350652L;

	/**
	 *  定义jackson对象
	 */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     *  响应业务状态
     */
    private Integer status;

    /**
     *  响应消息
     */
    private String msg;

    /**
     *  响应中的数据
     */
    private Object data;

    /**
     * 成功状态码
     */
    public static final Integer SUCCESS_CODE = 0;
    /**
     * 成功描述
     */
    public static final String  SUCCESS_MSG = "操作成功";
    /**
     * 失败状态码
     */
    public static final Integer ERROR_CODE = 1;
    /**
     * 失败描述
     */
    public static final String  ERROR_MSG = "操作失败";
    
    
    public static Result success(Object data) {
        return new Result(SUCCESS_CODE,SUCCESS_MSG,data);
    }

    public static Result success() {
    	return new Result(SUCCESS_CODE,SUCCESS_MSG,null);
    }
    
    public static Result error(Object data) {
        return new Result(ERROR_CODE,ERROR_MSG,data);
    }

    public static Result error() {
    	return new Result(ERROR_CODE,ERROR_MSG,null);
    }

    public static Result build(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }
    
    public static Result build(Integer status, String msg) {
    	return new Result(status, msg, null);
    }
    
    public Result() {

    }

    public Result(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为TaotaoResult对象
     * 
     * @param jsonData json数据
     * @param clazz TaotaoResult中的object类型
     * @return
     */
    /*public static Result formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, Result.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }*/

    /**
     * 没有object对象的转化
     * 
     * @param json
     * @return
     */
    public static Result format(String json) {
        try {
            return MAPPER.readValue(json, Result.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     * 
     * @param jsonData json数据
     * @param clazz 集合中的类型
     * @return
     */
    /* public static Result formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("status").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }*/

}
