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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterAvailableResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterAvailableResourceResponse extends AcsResponse {

	private String requestId;

	private List<String> slaveZones;

	private List<String> masterZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getSlaveZones() {
		return this.slaveZones;
	}

	public void setSlaveZones(List<String> slaveZones) {
		this.slaveZones = slaveZones;
	}

	public List<String> getMasterZones() {
		return this.masterZones;
	}

	public void setMasterZones(List<String> masterZones) {
		this.masterZones = masterZones;
	}

	@Override
	public ListTransitRouterAvailableResourceResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterAvailableResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
