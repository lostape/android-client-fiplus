package com.wordnik.client.api;

import com.wordnik.client.ApiException;
import com.wordnik.client.ApiInvoker;
import com.wordnik.client.model.Location;

import java.util.HashMap;
import java.util.Map;

public class MatchApi {
  String basePath = "/dev/extensions";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  public String matchEvents (String user_id, Integer num_events, Boolean by_interest, Integer priority_offset, Location body) throws ApiException {
    // verify required params are set
    if(user_id == null || num_events == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/match/events".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(user_id)))
      queryParams.put("user_id", String.valueOf(user_id));
    if(!"null".equals(String.valueOf(num_events)))
      queryParams.put("num_events", String.valueOf(num_events));
    if(!"null".equals(String.valueOf(by_interest)))
      queryParams.put("by_interest", String.valueOf(by_interest));
    if(!"null".equals(String.valueOf(priority_offset)))
      queryParams.put("priority_offset", String.valueOf(priority_offset));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, body, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  }
