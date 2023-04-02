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

package com.aliyuncs.pvtz.transform.v20180101;

import com.aliyuncs.pvtz.model.v20180101.AddZoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddZoneResponseUnmarshaller {

	public static AddZoneResponse unmarshall(AddZoneResponse addZoneResponse, UnmarshallerContext _ctx) {
		
		addZoneResponse.setRequestId(_ctx.stringValue("AddZoneResponse.RequestId"));
		addZoneResponse.setZoneName(_ctx.stringValue("AddZoneResponse.ZoneName"));
		addZoneResponse.setZoneId(_ctx.stringValue("AddZoneResponse.ZoneId"));
		addZoneResponse.setSuccess(_ctx.booleanValue("AddZoneResponse.Success"));
	 
	 	return addZoneResponse;
	}
}