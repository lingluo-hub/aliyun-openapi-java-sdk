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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.GetUserMFAInfoResponse;
import com.aliyuncs.ims.model.v20190815.GetUserMFAInfoResponse.MFADevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserMFAInfoResponseUnmarshaller {

	public static GetUserMFAInfoResponse unmarshall(GetUserMFAInfoResponse getUserMFAInfoResponse, UnmarshallerContext _ctx) {
		
		getUserMFAInfoResponse.setRequestId(_ctx.stringValue("GetUserMFAInfoResponse.RequestId"));
		getUserMFAInfoResponse.setIsMFAEnable(_ctx.booleanValue("GetUserMFAInfoResponse.IsMFAEnable"));

		MFADevice mFADevice = new MFADevice();
		mFADevice.setSerialNumber(_ctx.stringValue("GetUserMFAInfoResponse.MFADevice.SerialNumber"));
		mFADevice.setType(_ctx.stringValue("GetUserMFAInfoResponse.MFADevice.Type"));
		getUserMFAInfoResponse.setMFADevice(mFADevice);
	 
	 	return getUserMFAInfoResponse;
	}
}