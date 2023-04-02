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

package com.aliyuncs.pvtz.model.v20180101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pvtz.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddZoneRequest extends RpcAcsRequest<AddZoneResponse> {
	   

	private String proxyPattern;

	private String zoneName;

	private String resourceGroupId;

	private String zoneTag;

	private String zoneType;

	private String lang;
	public AddZoneRequest() {
		super("pvtz", "2018-01-01", "AddZone", "pvtz");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProxyPattern() {
		return this.proxyPattern;
	}

	public void setProxyPattern(String proxyPattern) {
		this.proxyPattern = proxyPattern;
		if(proxyPattern != null){
			putQueryParameter("ProxyPattern", proxyPattern);
		}
	}

	public String getZoneName() {
		return this.zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
		if(zoneName != null){
			putQueryParameter("ZoneName", zoneName);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getZoneTag() {
		return this.zoneTag;
	}

	public void setZoneTag(String zoneTag) {
		this.zoneTag = zoneTag;
		if(zoneTag != null){
			putQueryParameter("ZoneTag", zoneTag);
		}
	}

	public String getZoneType() {
		return this.zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
		if(zoneType != null){
			putQueryParameter("ZoneType", zoneType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<AddZoneResponse> getResponseClass() {
		return AddZoneResponse.class;
	}

}
