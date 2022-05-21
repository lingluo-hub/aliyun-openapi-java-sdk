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
public class SetCasterChannelRequest extends RpcAcsRequest<SetCasterChannelResponse> {
	   

	private String faceBeauty;

	private Integer seekOffset;

	private Integer playStatus;

	private String resourceId;

	private String casterId;

	private Long ownerId;

	private String channelId;
	public SetCasterChannelRequest() {
		super("live", "2016-11-01", "SetCasterChannel", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFaceBeauty() {
		return this.faceBeauty;
	}

	public void setFaceBeauty(String faceBeauty) {
		this.faceBeauty = faceBeauty;
		if(faceBeauty != null){
			putQueryParameter("FaceBeauty", faceBeauty);
		}
	}

	public Integer getSeekOffset() {
		return this.seekOffset;
	}

	public void setSeekOffset(Integer seekOffset) {
		this.seekOffset = seekOffset;
		if(seekOffset != null){
			putQueryParameter("SeekOffset", seekOffset.toString());
		}
	}

	public Integer getPlayStatus() {
		return this.playStatus;
	}

	public void setPlayStatus(Integer playStatus) {
		this.playStatus = playStatus;
		if(playStatus != null){
			putQueryParameter("PlayStatus", playStatus.toString());
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

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<SetCasterChannelResponse> getResponseClass() {
		return SetCasterChannelResponse.class;
	}

}
