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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListObjectsRequest extends RpcAcsRequest<ListObjectsResponse> {
	   

	private Integer maxKeys;

	private String continuationToken;

	private String prefix;

	private String delimiter;

	private String bucketName;

	private String encodingType;

	private String startAfter;

	private Long ownerId;

	private String marker;
	public ListObjectsRequest() {
		super("vs", "2018-12-12", "ListObjects");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getMaxKeys() {
		return this.maxKeys;
	}

	public void setMaxKeys(Integer maxKeys) {
		this.maxKeys = maxKeys;
		if(maxKeys != null){
			putQueryParameter("MaxKeys", maxKeys.toString());
		}
	}

	public String getContinuationToken() {
		return this.continuationToken;
	}

	public void setContinuationToken(String continuationToken) {
		this.continuationToken = continuationToken;
		if(continuationToken != null){
			putQueryParameter("ContinuationToken", continuationToken);
		}
	}

	public String getPrefix() {
		return this.prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
		if(prefix != null){
			putQueryParameter("Prefix", prefix);
		}
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
		if(delimiter != null){
			putQueryParameter("Delimiter", delimiter);
		}
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
		if(bucketName != null){
			putQueryParameter("BucketName", bucketName);
		}
	}

	public String getEncodingType() {
		return this.encodingType;
	}

	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
		if(encodingType != null){
			putQueryParameter("EncodingType", encodingType);
		}
	}

	public String getStartAfter() {
		return this.startAfter;
	}

	public void setStartAfter(String startAfter) {
		this.startAfter = startAfter;
		if(startAfter != null){
			putQueryParameter("StartAfter", startAfter);
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

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
		if(marker != null){
			putQueryParameter("Marker", marker);
		}
	}

	@Override
	public Class<ListObjectsResponse> getResponseClass() {
		return ListObjectsResponse.class;
	}

}
