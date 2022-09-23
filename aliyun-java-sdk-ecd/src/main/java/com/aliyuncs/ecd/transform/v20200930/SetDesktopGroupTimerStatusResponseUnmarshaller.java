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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.SetDesktopGroupTimerStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetDesktopGroupTimerStatusResponseUnmarshaller {

	public static SetDesktopGroupTimerStatusResponse unmarshall(SetDesktopGroupTimerStatusResponse setDesktopGroupTimerStatusResponse, UnmarshallerContext _ctx) {
		
		setDesktopGroupTimerStatusResponse.setRequestId(_ctx.stringValue("SetDesktopGroupTimerStatusResponse.RequestId"));
		setDesktopGroupTimerStatusResponse.setDesktopGroupId(_ctx.stringValue("SetDesktopGroupTimerStatusResponse.DesktopGroupId"));

		List<String> orderIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SetDesktopGroupTimerStatusResponse.OrderIds.Length"); i++) {
			orderIds.add(_ctx.stringValue("SetDesktopGroupTimerStatusResponse.OrderIds["+ i +"]"));
		}
		setDesktopGroupTimerStatusResponse.setOrderIds(orderIds);
	 
	 	return setDesktopGroupTimerStatusResponse;
	}
}