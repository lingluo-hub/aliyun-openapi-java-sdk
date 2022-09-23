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

package com.aliyuncs.amp.transform.v20200708;

import com.aliyuncs.amp.model.v20200708.HuichengTestRoaDataApiResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class HuichengTestRoaDataApiResponseUnmarshaller {

	public static HuichengTestRoaDataApiResponse unmarshall(HuichengTestRoaDataApiResponse huichengTestRoaDataApiResponse, UnmarshallerContext _ctx) {
		
		huichengTestRoaDataApiResponse.setRequestId(_ctx.stringValue("HuichengTestRoaDataApiResponse.requestId"));
	 
	 	return huichengTestRoaDataApiResponse;
	}
}