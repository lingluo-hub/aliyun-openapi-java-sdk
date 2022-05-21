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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmInstanceResponse extends AcsResponse {

	private Long expireTimestamp;

	private String userDomainName;

	private String requestId;

	private String lbaStrategy;

	private String instanceId;

	private String createTime;

	private String cnameMode;

	private Integer ttl;

	private String cname;

	private String instanceName;

	private String versionCode;

	private String alertGroup;

	private Integer addressPoolNum;

	private Integer accessStrategyNum;

	private String expireTime;

	private Long createTimestamp;

	private String resourceGroupId;

	public Long getExpireTimestamp() {
		return this.expireTimestamp;
	}

	public void setExpireTimestamp(Long expireTimestamp) {
		this.expireTimestamp = expireTimestamp;
	}

	public String getUserDomainName() {
		return this.userDomainName;
	}

	public void setUserDomainName(String userDomainName) {
		this.userDomainName = userDomainName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLbaStrategy() {
		return this.lbaStrategy;
	}

	public void setLbaStrategy(String lbaStrategy) {
		this.lbaStrategy = lbaStrategy;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCnameMode() {
		return this.cnameMode;
	}

	public void setCnameMode(String cnameMode) {
		this.cnameMode = cnameMode;
	}

	public Integer getTtl() {
		return this.ttl;
	}

	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getAlertGroup() {
		return this.alertGroup;
	}

	public void setAlertGroup(String alertGroup) {
		this.alertGroup = alertGroup;
	}

	public Integer getAddressPoolNum() {
		return this.addressPoolNum;
	}

	public void setAddressPoolNum(Integer addressPoolNum) {
		this.addressPoolNum = addressPoolNum;
	}

	public Integer getAccessStrategyNum() {
		return this.accessStrategyNum;
	}

	public void setAccessStrategyNum(Integer accessStrategyNum) {
		this.accessStrategyNum = accessStrategyNum;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Long getCreateTimestamp() {
		return this.createTimestamp;
	}

	public void setCreateTimestamp(Long createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	@Override
	public DescribeGtmInstanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
