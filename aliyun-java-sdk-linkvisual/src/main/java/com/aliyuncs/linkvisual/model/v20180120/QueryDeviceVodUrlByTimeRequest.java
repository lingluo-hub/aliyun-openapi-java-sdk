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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceVodUrlByTimeRequest extends RpcAcsRequest<QueryDeviceVodUrlByTimeResponse> {
	   

	private String scheme;

	private Boolean playUnLimited;

	private Integer encryptType;

	private String iotId;

	private String iotInstanceId;

	private Boolean shouldEncrypt;

	private Integer endTime;

	private Integer beginTime;

	private String productKey;

	private Integer seekTime;

	private String deviceName;

	private Integer urlValidDuration;
	public QueryDeviceVodUrlByTimeRequest() {
		super("Linkvisual", "2018-01-20", "QueryDeviceVodUrlByTime", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
		if(scheme != null){
			putQueryParameter("Scheme", scheme);
		}
	}

	public Boolean getPlayUnLimited() {
		return this.playUnLimited;
	}

	public void setPlayUnLimited(Boolean playUnLimited) {
		this.playUnLimited = playUnLimited;
		if(playUnLimited != null){
			putQueryParameter("PlayUnLimited", playUnLimited.toString());
		}
	}

	public Integer getEncryptType() {
		return this.encryptType;
	}

	public void setEncryptType(Integer encryptType) {
		this.encryptType = encryptType;
		if(encryptType != null){
			putQueryParameter("EncryptType", encryptType.toString());
		}
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Boolean getShouldEncrypt() {
		return this.shouldEncrypt;
	}

	public void setShouldEncrypt(Boolean shouldEncrypt) {
		this.shouldEncrypt = shouldEncrypt;
		if(shouldEncrypt != null){
			putQueryParameter("ShouldEncrypt", shouldEncrypt.toString());
		}
	}

	public Integer getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Integer getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Integer beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public Integer getSeekTime() {
		return this.seekTime;
	}

	public void setSeekTime(Integer seekTime) {
		this.seekTime = seekTime;
		if(seekTime != null){
			putQueryParameter("SeekTime", seekTime.toString());
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public Integer getUrlValidDuration() {
		return this.urlValidDuration;
	}

	public void setUrlValidDuration(Integer urlValidDuration) {
		this.urlValidDuration = urlValidDuration;
		if(urlValidDuration != null){
			putQueryParameter("UrlValidDuration", urlValidDuration.toString());
		}
	}

	@Override
	public Class<QueryDeviceVodUrlByTimeResponse> getResponseClass() {
		return QueryDeviceVodUrlByTimeResponse.class;
	}

}
