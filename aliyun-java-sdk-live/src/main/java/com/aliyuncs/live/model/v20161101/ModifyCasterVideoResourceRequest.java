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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCasterVideoResourceRequest extends RpcAcsRequest<ModifyCasterVideoResourceResponse> {
	   

	private Integer endOffset;

	private String materialId;

	private String resourceId;

	private String vodUrl;

	private String casterId;

	private Long ownerId;

	private Integer beginOffset;

	private String liveStreamUrl;

	private Integer ptsCallbackInterval;

	private String resourceName;

	private Integer repeatNum;
	public ModifyCasterVideoResourceRequest() {
		super("live", "2016-11-01", "ModifyCasterVideoResource", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getEndOffset() {
		return this.endOffset;
	}

	public void setEndOffset(Integer endOffset) {
		this.endOffset = endOffset;
		if(endOffset != null){
			putQueryParameter("EndOffset", endOffset.toString());
		}
	}

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getVodUrl() {
		return this.vodUrl;
	}

	public void setVodUrl(String vodUrl) {
		this.vodUrl = vodUrl;
		if(vodUrl != null){
			putQueryParameter("VodUrl", vodUrl);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
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

	public Integer getBeginOffset() {
		return this.beginOffset;
	}

	public void setBeginOffset(Integer beginOffset) {
		this.beginOffset = beginOffset;
		if(beginOffset != null){
			putQueryParameter("BeginOffset", beginOffset.toString());
		}
	}

	public String getLiveStreamUrl() {
		return this.liveStreamUrl;
	}

	public void setLiveStreamUrl(String liveStreamUrl) {
		this.liveStreamUrl = liveStreamUrl;
		if(liveStreamUrl != null){
			putQueryParameter("LiveStreamUrl", liveStreamUrl);
		}
	}

	public Integer getPtsCallbackInterval() {
		return this.ptsCallbackInterval;
	}

	public void setPtsCallbackInterval(Integer ptsCallbackInterval) {
		this.ptsCallbackInterval = ptsCallbackInterval;
		if(ptsCallbackInterval != null){
			putQueryParameter("PtsCallbackInterval", ptsCallbackInterval.toString());
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public Integer getRepeatNum() {
		return this.repeatNum;
	}

	public void setRepeatNum(Integer repeatNum) {
		this.repeatNum = repeatNum;
		if(repeatNum != null){
			putQueryParameter("RepeatNum", repeatNum.toString());
		}
	}

	@Override
	public Class<ModifyCasterVideoResourceResponse> getResponseClass() {
		return ModifyCasterVideoResourceResponse.class;
	}

}
