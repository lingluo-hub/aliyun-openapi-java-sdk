/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLiveSnapshotDetectPornConfigRequest extends RpcAcsRequest<AddLiveSnapshotDetectPornConfigResponse> {
	   

	private String ossEndpoint;

	private String ossObject;

	private List<String> scenes;

	private String appName;

	private String securityToken;

	private String ossBucket;

	private String domainName;

	private Long ownerId;

	private Integer interval;
	public AddLiveSnapshotDetectPornConfigRequest() {
		super("live", "2016-11-01", "AddLiveSnapshotDetectPornConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOssEndpoint() {
		return this.ossEndpoint;
	}

	public void setOssEndpoint(String ossEndpoint) {
		this.ossEndpoint = ossEndpoint;
		if(ossEndpoint != null){
			putQueryParameter("OssEndpoint", ossEndpoint);
		}
	}

	public String getOssObject() {
		return this.ossObject;
	}

	public void setOssObject(String ossObject) {
		this.ossObject = ossObject;
		if(ossObject != null){
			putQueryParameter("OssObject", ossObject);
		}
	}

	public List<String> getScenes() {
		return this.scenes;
	}

	public void setScenes(List<String> scenes) {
		this.scenes = scenes;	
		if (scenes != null) {
			for (int i = 0; i < scenes.size(); i++) {
				putQueryParameter("Scene." + (i + 1) , scenes.get(i));
			}
		}	
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getOssBucket() {
		return this.ossBucket;
	}

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
		if(ossBucket != null){
			putQueryParameter("OssBucket", ossBucket);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Integer getInterval() {
		return this.interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
		if(interval != null){
			putQueryParameter("Interval", interval.toString());
		}
	}

	@Override
	public Class<AddLiveSnapshotDetectPornConfigResponse> getResponseClass() {
		return AddLiveSnapshotDetectPornConfigResponse.class;
	}

}
