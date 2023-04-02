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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopSlotRequest extends RoaAcsRequest<StopSlotResponse> {
	   

	private String slotId;
	public StopSlotRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "StopSlot", "datasetacc");
		setUriPattern("/api/v1/slots/[SlotId]/action/stop");
		setMethod(MethodType.POST);
	}

	public String getSlotId() {
		return this.slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
		if(slotId != null){
			putPathParameter("SlotId", slotId);
		}
	}

	@Override
	public Class<StopSlotResponse> getResponseClass() {
		return StopSlotResponse.class;
	}

}
