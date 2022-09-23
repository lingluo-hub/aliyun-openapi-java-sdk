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
public class RemoveShowFromShowListRequest extends RpcAcsRequest<RemoveShowFromShowListResponse> {
	   

	private Boolean isBatchMode;

	private List<String> showIdLists;

	private String casterId;

	private Long ownerId;

	private String showId;
	public RemoveShowFromShowListRequest() {
		super("live", "2016-11-01", "RemoveShowFromShowList", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsBatchMode() {
		return this.isBatchMode;
	}

	public void setIsBatchMode(Boolean isBatchMode) {
		this.isBatchMode = isBatchMode;
		if(isBatchMode != null){
			putQueryParameter("isBatchMode", isBatchMode.toString());
		}
	}

	public List<String> getShowIdLists() {
		return this.showIdLists;
	}

	public void setShowIdLists(List<String> showIdLists) {
		this.showIdLists = showIdLists;	
		if (showIdLists != null) {
			for (int i = 0; i < showIdLists.size(); i++) {
				putQueryParameter("showIdList." + (i + 1) , showIdLists.get(i));
			}
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

	public String getShowId() {
		return this.showId;
	}

	public void setShowId(String showId) {
		this.showId = showId;
		if(showId != null){
			putQueryParameter("ShowId", showId);
		}
	}

	@Override
	public Class<RemoveShowFromShowListResponse> getResponseClass() {
		return RemoveShowFromShowListResponse.class;
	}

}
