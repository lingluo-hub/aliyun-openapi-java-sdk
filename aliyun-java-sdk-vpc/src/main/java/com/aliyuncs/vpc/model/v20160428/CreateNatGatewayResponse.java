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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.CreateNatGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateNatGatewayResponse extends AcsResponse {

	private String natGatewayId;

	private String requestId;

	private List<String> forwardTableIds;

	private List<String> snatTableIds;

	private List<String> bandwidthPackageIds;

	private List<String> fullNatTableIds;

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getForwardTableIds() {
		return this.forwardTableIds;
	}

	public void setForwardTableIds(List<String> forwardTableIds) {
		this.forwardTableIds = forwardTableIds;
	}

	public List<String> getSnatTableIds() {
		return this.snatTableIds;
	}

	public void setSnatTableIds(List<String> snatTableIds) {
		this.snatTableIds = snatTableIds;
	}

	public List<String> getBandwidthPackageIds() {
		return this.bandwidthPackageIds;
	}

	public void setBandwidthPackageIds(List<String> bandwidthPackageIds) {
		this.bandwidthPackageIds = bandwidthPackageIds;
	}

	public List<String> getFullNatTableIds() {
		return this.fullNatTableIds;
	}

	public void setFullNatTableIds(List<String> fullNatTableIds) {
		this.fullNatTableIds = fullNatTableIds;
	}

	@Override
	public CreateNatGatewayResponse getInstance(UnmarshallerContext context) {
		return	CreateNatGatewayResponseUnmarshaller.unmarshall(this, context);
	}
}
