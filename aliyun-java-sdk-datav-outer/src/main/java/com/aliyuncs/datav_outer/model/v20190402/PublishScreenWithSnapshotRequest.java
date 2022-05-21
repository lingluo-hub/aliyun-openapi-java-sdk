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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datav_outer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublishScreenWithSnapshotRequest extends RpcAcsRequest<PublishScreenWithSnapshotResponse> {
	   

	private String product;

	private Integer snapshotId;

	private Boolean needToken;

	private String version;

	private Integer screenId;

	private String password;

	private Boolean enable;

	private String domain;

	private Integer authTime;

	private Boolean createSnapshot;
	public PublishScreenWithSnapshotRequest() {
		super("datav-outer", "2019-04-02", "PublishScreenWithSnapshot", "datav");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public Integer getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(Integer snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putBodyParameter("SnapshotId", snapshotId.toString());
		}
	}

	public Boolean getNeedToken() {
		return this.needToken;
	}

	public void setNeedToken(Boolean needToken) {
		this.needToken = needToken;
		if(needToken != null){
			putBodyParameter("NeedToken", needToken.toString());
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public Integer getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
		if(screenId != null){
			putBodyParameter("ScreenId", screenId.toString());
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public Boolean getEnable() {
		return this.enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
		if(enable != null){
			putBodyParameter("Enable", enable.toString());
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public Integer getAuthTime() {
		return this.authTime;
	}

	public void setAuthTime(Integer authTime) {
		this.authTime = authTime;
		if(authTime != null){
			putBodyParameter("AuthTime", authTime.toString());
		}
	}

	public Boolean getCreateSnapshot() {
		return this.createSnapshot;
	}

	public void setCreateSnapshot(Boolean createSnapshot) {
		this.createSnapshot = createSnapshot;
		if(createSnapshot != null){
			putBodyParameter("CreateSnapshot", createSnapshot.toString());
		}
	}

	@Override
	public Class<PublishScreenWithSnapshotResponse> getResponseClass() {
		return PublishScreenWithSnapshotResponse.class;
	}

}
