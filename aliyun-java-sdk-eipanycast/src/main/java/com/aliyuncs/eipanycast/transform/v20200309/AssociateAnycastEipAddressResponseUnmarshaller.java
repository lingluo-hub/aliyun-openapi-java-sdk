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

package com.aliyuncs.eipanycast.transform.v20200309;

import com.aliyuncs.eipanycast.model.v20200309.AssociateAnycastEipAddressResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateAnycastEipAddressResponseUnmarshaller {

	public static AssociateAnycastEipAddressResponse unmarshall(AssociateAnycastEipAddressResponse associateAnycastEipAddressResponse, UnmarshallerContext _ctx) {
		
		associateAnycastEipAddressResponse.setRequestId(_ctx.stringValue("AssociateAnycastEipAddressResponse.RequestId"));
	 
	 	return associateAnycastEipAddressResponse;
	}
}