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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeWebLockStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebLockStatusResponse extends AcsResponse {

	private Integer whiteCount;

	private String requestId;

	private Long expireTime;

	private Integer dirCount;

	private Integer authCount;

	private Integer bindCount;

	private Integer blockCount;

	public Integer getWhiteCount() {
		return this.whiteCount;
	}

	public void setWhiteCount(Integer whiteCount) {
		this.whiteCount = whiteCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getDirCount() {
		return this.dirCount;
	}

	public void setDirCount(Integer dirCount) {
		this.dirCount = dirCount;
	}

	public Integer getAuthCount() {
		return this.authCount;
	}

	public void setAuthCount(Integer authCount) {
		this.authCount = authCount;
	}

	public Integer getBindCount() {
		return this.bindCount;
	}

	public void setBindCount(Integer bindCount) {
		this.bindCount = bindCount;
	}

	public Integer getBlockCount() {
		return this.blockCount;
	}

	public void setBlockCount(Integer blockCount) {
		this.blockCount = blockCount;
	}

	@Override
	public DescribeWebLockStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebLockStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
