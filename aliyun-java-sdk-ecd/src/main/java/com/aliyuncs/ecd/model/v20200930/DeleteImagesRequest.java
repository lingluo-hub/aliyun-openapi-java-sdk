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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteImagesRequest extends RpcAcsRequest<DeleteImagesResponse> {
	   

	private List<String> imageIds;

	private Boolean deleteCascadedBundle;
	public DeleteImagesRequest() {
		super("ecd", "2020-09-30", "DeleteImages");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getImageIds() {
		return this.imageIds;
	}

	public void setImageIds(List<String> imageIds) {
		this.imageIds = imageIds;	
		if (imageIds != null) {
			for (int i = 0; i < imageIds.size(); i++) {
				putQueryParameter("ImageId." + (i + 1) , imageIds.get(i));
			}
		}	
	}

	public Boolean getDeleteCascadedBundle() {
		return this.deleteCascadedBundle;
	}

	public void setDeleteCascadedBundle(Boolean deleteCascadedBundle) {
		this.deleteCascadedBundle = deleteCascadedBundle;
		if(deleteCascadedBundle != null){
			putQueryParameter("DeleteCascadedBundle", deleteCascadedBundle.toString());
		}
	}

	@Override
	public Class<DeleteImagesResponse> getResponseClass() {
		return DeleteImagesResponse.class;
	}

}
