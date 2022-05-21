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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeCertificateTypeListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateTypeListResponseUnmarshaller {

	public static DescribeCertificateTypeListResponse unmarshall(DescribeCertificateTypeListResponse describeCertificateTypeListResponse, UnmarshallerContext _ctx) {
		
		describeCertificateTypeListResponse.setRequestId(_ctx.stringValue("DescribeCertificateTypeListResponse.RequestId"));

		List<String> typeList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertificateTypeListResponse.TypeList.Length"); i++) {
			typeList.add(_ctx.stringValue("DescribeCertificateTypeListResponse.TypeList["+ i +"]"));
		}
		describeCertificateTypeListResponse.setTypeList(typeList);
	 
	 	return describeCertificateTypeListResponse;
	}
}